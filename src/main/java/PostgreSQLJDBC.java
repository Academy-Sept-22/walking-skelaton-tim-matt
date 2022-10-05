import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class PostgreSQLJDBC {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = System.getenv("POSTGRESUSERNAME");
    static final String PASS = System.getenv("POSTGRESPASSWORD");

    public static void main(String args[]) {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }



}
