import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws SQLException{
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		String dburl="jdbc:mysql://192.168.0.147:3306/codebegun";
		String username="root";
		String password="root";
		String query="select * from userinfo_table";
		
		
		try {

			connection=DriverManager.getConnection(dburl,username,password);
			statement=connection.createStatement();
			resultset=statement.executeQuery(query);
			while(resultset.next()) {
				System.out.println(resultset.getString("userid"));
				System.out.println(resultset.getString("user_password"));
				System.out.println(resultset.getString("userinfo_id"));
				System.out.println("-------------------------------");

			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			statement.close();
			resultset.close();
			
			
		}
	}
}
