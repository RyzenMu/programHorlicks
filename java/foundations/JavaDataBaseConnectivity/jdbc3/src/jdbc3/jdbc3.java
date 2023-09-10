package jdbc3;

import java.sql.*;

public class jdbc3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Database Management connectivity");
		
		String url = "jdbc:mysql://localhost:3306/busstand";
		String uname = "root";
		String pass = "rootroot";
		String query = "SELECT * FROM bus";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println(rs);
		rs.next();
		String name = rs.getString(2);
		System.out.println(name);
		rs.next();
		String name1 = rs.getString(2);
		System.out.println(name1);
		for(int i=0; i<=2; i++)
		{
			System.out.println(i);
			rs.next();
			String name2 = rs.getString(2);
			System.out.println(name2);
		}
		st.close();
		con.close();
	}

}
