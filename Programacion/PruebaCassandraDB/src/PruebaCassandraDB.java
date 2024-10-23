import com.datastax.oss.driver.api.core.CqlSession;

public class PruebaCassandraDB {
    public static void main(String[] args) {
        // Conectar a Cassandra utilizando el keyspace "system"
        try (CqlSession session = CqlSession.builder().withKeyspace("system").build()) {
            // Ejecutar una consulta simple para obtener la versión de Cassandra
            String query = "SELECT release_version FROM system.local";
            String releaseVersion = session.execute(query)
                    .one()
                    .getString("release_version");

            // Imprimir la versión de Cassandra
            System.out.println("Cassandra version: " + releaseVersion);
        } catch (Exception e) {
            // Manejar excepciones si hay problemas con la conexión
            System.err.println("Error al conectar a Cassandra: " + e.getMessage());
        }
    }
}
