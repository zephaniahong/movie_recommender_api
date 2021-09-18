import java.sql.*;
import java.util.Arrays;

public class PostgreSQLJDBC {
    public static String[] get_recommendation(String movie) {
        Connection c = null;
        Statement stmt = null;
        String[] movie_list = new String[3];
        try {
            /* Class.forName("org.postgresql.Driver"); */
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/movie_recommender_api",
                            "zephaniahong", "password");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM movies ORDER BY random() LIMIT 3;");
            int index = 0;
            while (rs.next()){
                String title = rs.getString("title");
                movie_list[index] = title;
                index++;
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return movie_list;
    }

//    public static void main(String args[]) {
//        ArrayList recommendations = get_recommendation("iron man");
//        System.out.println(recommendations);
//    }
}
