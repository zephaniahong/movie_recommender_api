import java.sql.*;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            /* Class.forName("org.postgresql.Driver"); */
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/movie_recommender_api",
                            "zephaniahong", "password");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM movies;" );
            while ( rs.next() ) {
                int id = rs.getInt("movie_id");
                String title = rs.getString("title");
                System.out.println( "ID = " + id );
                System.out.println( "TITLE = " + title );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
