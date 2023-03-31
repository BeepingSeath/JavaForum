import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Model {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://"+ env.URL + ":3306/" + env.Database +"?" +  "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",env.user,env.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
