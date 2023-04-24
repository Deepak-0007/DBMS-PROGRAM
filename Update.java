package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Update {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// register driver step1
		// create connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
		Statement stmt=conn.createStatement();
		//update an existing record
		stmt.executeUpdate("update studentdemo set ename = 'ajay' where rollno=2");
		stmt.executeUpdate("delete from studentdemo where rollno=1");
		//delete record
		// execute the fetch database
	ResultSet rs=stmt.executeQuery("select * from studentdemo");
	//iteration
	while (rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	conn.close();
	//close database connection step5
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
