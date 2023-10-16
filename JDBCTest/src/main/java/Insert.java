import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;

//        String dburl = "jdbc:mysql://192.168.0.125:3306/vignesh";			//Codebegun wifi
		String dburl="jdbc:mysql://192.168.29.128:3306/vignesh";			// dhanush Wifi

        String username = "root";
        String password = "rootroot";
        String insertquery = "insert into student(StudentID, FirstName, LastName, Email, Mobile) values (?,?,?,?,?)";
        try {
            connection = DriverManager.getConnection(dburl, username, password);
            statement = connection.prepareStatement(insertquery);
            statement.setInt(1, 31);
            statement.setString(2, "Yashwanth");
            statement.setString(3, "gurram");
            statement.setString(4, "gurram@gmail.com");
            statement.setString(5, "778993744");

            int result = statement.executeUpdate();
			System.out.println("Rows affected: "+result);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
