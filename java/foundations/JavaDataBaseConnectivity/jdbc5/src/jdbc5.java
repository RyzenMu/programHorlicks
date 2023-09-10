//package jdbc5; 

import java.sql.*;
public class jdbc5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/banks";
		String uname = "root";
		String pass = "rootroot";
		String query = "SELECT * FROM bank_details";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next())
		{
			String user_data = rs.getInt(1) + "  "+ rs.getString(2)+ " "+rs.getInt(3);
			System.out.println(user_data);
		}
		
		st.close();
		con.close();
		
	}

}
