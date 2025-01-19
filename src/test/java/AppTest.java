import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.DatabaseConnection;

public class AppTest {
    @Test
    void testDatabaseConnection() throws SQLException {
        try (Connection conn = DatabaseConnection.connect()) {
            assertNotNull(conn, "Conexão deve ser estabelecida");
        } 
    }
}
