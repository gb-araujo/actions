import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import com.example.DatabaseConnection;

public class AppTest {
    @Test
    void testDatabaseConnection() {
        try (Connection conn = DatabaseConnection.connect()) {
            assertNotNull(conn, "Conexão deve ser estabelecida");
        } catch (Exception e) {
            fail("Falha na conexão: " + e.getMessage());
        }
    }
}
