import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCSelectionMain {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		
//		String dburl="jdbc:mysql://192.168.0.125:3306/vignesh";
		String dburl="jdbc:mysql://192.168.29.128:3306/vignesh";
		String username="root";
		String password="rootroot";
		String query="select*from student";

		try {
			connection=DriverManager.getConnection(dburl,username,password);
			statement=connection.createStatement();
			resultset=statement.executeQuery(query);

			
			
			JDBCInput JDBCinput=new JDBCInput();
			
			while(resultset.next()) {
				List<JDBCInput> list=new ArrayList<>();
				
				JDBCinput.setStudentID(resultset.getInt("StudentID"));
				JDBCinput.setFirstName(resultset.getString("FirstName"));
				JDBCinput.setEmail(resultset.getString("Email"));
				JDBCinput.setMobile(resultset.getLong("Mobile"));
				
				list.add(JDBCinput);
				
				for(JDBCInput element: list) {
					System.out.println("student Id: "+element.getStudentID());
					System.out.println("First name: "+element.getFirstName());
					System.out.println("Email: "+element.getEmail());
					System.out.println("Mobile: "+element.getMobile());
					System.out.println("----------------------");

					
				}
				
				
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
