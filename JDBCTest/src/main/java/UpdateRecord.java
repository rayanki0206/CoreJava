import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement statement=null;
//		String dburl="jdbc:mysql://192.168.29.128:3306/vignesh";			//Dhanush wifi
		String dburl="jdbc:mysql://192.168.1.3:3306/vignesh";     		// TV anna Wifi
		
		String username="root";
		String password="rootroot";
		String updateQuery="UPDATE student SET StudentID=?, LastName=? 	WHERE StudentId=?";
		try {
			connection=DriverManager.getConnection(dburl,username,password);
			statement=connection.prepareStatement(updateQuery);
			statement.setInt(1,12013);
			statement.setString(2, "Kumar");
			statement.setInt(3, 31);
			int result=statement.executeUpdate();
			System.out.println("Rows affected: "+result);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			statement.close();
			connection.close();

			
		}
		

		
		
		

		
	}

}
