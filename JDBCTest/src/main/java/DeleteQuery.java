import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement statement=null;
		String dburl="jdbc:mysql://192.168.1.3:3306/vignesh";
		
		String username="root";
		String password="rootroot";
		String deleteQuery="DELETE FROM student WHERE StudentId=?";
		
		try {
			connection=DriverManager.getConnection(dburl, username, password);
			statement=connection.prepareStatement(deleteQuery);
			statement.setInt(1, 30);
			int result=statement.executeUpdate();
			System.out.println("Rows affected: "+result);
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			connection.close();
			statement.close();
		}
		
		
	}
}
