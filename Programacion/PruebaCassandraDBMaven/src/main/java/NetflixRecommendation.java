import com.datastax.oss.driver.api.core.CqlSession;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.net.InetSocketAddress;

public class NetflixRecommendation {
    public static void main(String[] args) {
        // Configuración de Hadoop y desactivación de la política de seguridad
        System.setProperty("hadoop.home.dir", "C:\\hadoop"); // Asegúrate de que esta ruta sea correcta
        System.setProperty("java.security.policy", "none"); // Desactivar política de seguridad

        // 1. Conexión a Cassandra
        try (CqlSession session = CqlSession.builder()
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9042)) // Conexión a Cassandra en localhost
                .withLocalDatacenter("datacenter1") // Nombre del datacenter (por defecto en Cassandra)
                .build()) {

            // Crear keyspace y tabla si no existen
            session.execute("CREATE KEYSPACE IF NOT EXISTS recommendations WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};");
            session.execute("CREATE TABLE IF NOT EXISTS recommendations.user_series (user TEXT, series TEXT, PRIMARY KEY (user, series));");

            // Insertar datos de ejemplo
            session.execute("INSERT INTO recommendations.user_series (user, series) VALUES ('Alice', 'Stranger Things');");
            session.execute("INSERT INTO recommendations.user_series (user, series) VALUES ('Bob', 'The Crown');");
            session.execute("INSERT INTO recommendations.user_series (user, series) VALUES ('Alice', 'Breaking Bad');");
            System.out.println("Datos iniciales insertados en Cassandra.");
        }

        // 2. Configuración de Spark
        SparkConf conf = new SparkConf()
                .setAppName("NetflixRecommendation") // Nombre de la aplicación Spark
                .setMaster("local[*]"); // Ejecutar en modo local

        // Crear el contexto de Spark
        JavaSparkContext sc = new JavaSparkContext(conf);
        SparkSession spark = SparkSession.builder()
                .config(conf)
                .getOrCreate();

        // 3. Leer datos desde Cassandra
        Dataset<Row> data = spark.read()
                .format("org.apache.spark.sql.cassandra") // Usar el conector de Cassandra
                .option("keyspace", "recommendations") // Nombre del keyspace
                .option("table", "user_series") // Nombre de la tabla
                .load();

        // Mostrar datos leídos
        System.out.println("Datos leídos desde Cassandra:");
        data.show();

        // 4. Ejemplo de recomendación
        data.createOrReplaceTempView("user_series");
        Dataset<Row> recommendations = spark.sql("SELECT * FROM user_series WHERE user != 'Alice'");

        // Mostrar recomendaciones
        System.out.println("Recomendaciones para otros usuarios:");
        recommendations.show();

        // Cerrar el contexto de Spark
        sc.close();
    }
}