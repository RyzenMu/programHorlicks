

package jdbc2;

import java.sql.*;

public class JdbcCon2 {
	
	public static void main(String args[]) throws Exception 
	
	{
		String url ="jdbc:mysql://localhost:3306/superMarket";
		String uname = "root";
		String pass = "rootroot";
		String query = "SELECT * FROM superMarket";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		String name = rs.getString(2);
		System.out.println("Java Database Connectivity");
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
