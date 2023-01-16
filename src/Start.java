import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Inazumaeleven1#");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            List<String> surnames = new ArrayList<>();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                surnames.add(resultSet.getString("last_name"));
            }
            System.out.println(surnames);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
