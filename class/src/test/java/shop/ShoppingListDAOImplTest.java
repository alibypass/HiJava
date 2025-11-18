package shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShoppingListDAOImplTest {

    public static final String URL = "jdbc:mysql://localhost:3306/shop";
    public static final String PASSWORD = "";
    public static final String USER = "root";

    @Test
    void should_connect_to_mysql_database () {
        try (final Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (conn == null) {
                Assertions.fail("connection failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail("connection failedd");

        }
    }

    @Test
    void should_insert_read_delete_an_item_in_database() {
        try (final Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement insert = conn.prepareStatement("INSERT INTO item (name, quantity) value (?, ?, ?)");
            insert.setString(1, "orange");
            insert.setInt(2 ,5);
            insert.setInt(3, 3);
            insert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
