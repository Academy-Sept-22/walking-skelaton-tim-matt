import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = System.getenv("POSTGRESUSERNAME");
    static final String PASS = System.getenv("POSTGRESPASSWORD");

    public static void main(String args[]) {
        App app = new App();
        app.connect();
    }

    public Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
