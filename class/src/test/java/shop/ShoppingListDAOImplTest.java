package shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShoppingListDAOImplTest {

    @Test
    void should_connect_to_mysql_database () {
        try (final Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "")) {
            if (conn == null) {
                Assertions.fail("connection failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail("connection failedd");

        }
    }
}
