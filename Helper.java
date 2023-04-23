package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
public class Helper {
	static{
		try {
			//register my sql driver
			Class.forName("com.mysql.cj.jdbc.Driver");//driver class
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/c4119","root","root");
	}
}
