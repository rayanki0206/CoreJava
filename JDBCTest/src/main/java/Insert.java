import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;

		PreparedStatement statement=null;
		ResultSet resultset=null;
		String dburl="jdbc:mysql://192.168.0.125:3306/vignesh";
		String username="root";
		String password="rootroot";
		String insertquery="insert into student(StudentID,FirstName,LastName,Email,Mobile) values (?,?,?,?,?)";
		try {
			connection=DriverManager.getConnection(dburl,username,password);
			statement=connection.prepareStatement(insertquery);
			statement.setInt(1, 30);
			statement.setString(2, "Azzez");
			statement.setString(3, "shaik");
			statement.setString(4, "azzez@gmail.com");
			statement.setInt(5, 778993744);
			
			int result=statement.executeUpdate();
		}
			catch(Exception e) {
				e.printStackTrace();
			}finally {
				connection.close();
				statement.close();
//				resultset.close();
				
				
			}

}
}
