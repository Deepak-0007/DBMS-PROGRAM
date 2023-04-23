package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insert_jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("insert into studentdemo values(1,'Depak','Mca')");
			System.out.println("inserted sucessfully");
			conn.close();
			} catch(Exception e) {
				System.out.println(e);
			}
	}

}
