import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

public class PruebaCassandraDBMaven{
    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder().withKeyspace("ejemplo").build()) {
            System.out.println("Conectado a Cassandra en el Keyspace 'ejemplo'");

            // Crear un Keyspace
            session.execute("CREATE KEYSPACE IF NOT EXISTS ejemplo "
                    + "WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 }");
            System.out.println("Keyspace creado");

            // Crear una tabla
            String createTableQuery = "CREATE TABLE IF NOT EXISTS usuarios ("
                    + "id UUID PRIMARY KEY, "
                    + "nombre TEXT, "
                    + "edad INT)";
            session.execute(createTableQuery);
            System.out.println("Tabla 'usuarios' creada");

            // Eliminar datos (para no inflar la tabla cada vez que ejecute)
            session.execute("TRUNCATE TABLE usuarios");
            System.out.println("Datos eliminados de la tabla 'usuarios'");

            // Insertar datos
            String insertQuery = "INSERT INTO usuarios (id, nombre, edad) VALUES (uuid(), 'Paco', 23)";
            session.execute(insertQuery);
            System.out.println("Datos insertados");

            // Consultar datos
            ResultSet resultSet = session.execute("SELECT * FROM usuarios");
            System.out.println("Datos consultados:");
            for (Row row : resultSet) {
                System.out.println("ID: " + row.getUuid("id") + ", Nombre: " + row.getString("nombre") + ", Edad: " + row.getInt("edad"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}