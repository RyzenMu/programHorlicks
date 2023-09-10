
import java.sql.*;

public class insertData
{
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/banks";
		String uname = "root";
		String pass = "rootroot";
		int nu = 12;
		String bname = "xoi";
		int amt = 6000;
		//String query = "INSERT INTO bank_details VALUES (" + nu + ",'" + bname +"',"+ "5000)";
		String query = "INSERT INTO bank_details VALUES (?,?,?)";
		
		
		//String query1 = "INSERT INTO bank_details VALUES (10, 'sbi', 150000)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		//Statement st = con.createStatement();
		PreparedStatement st= con.prepareStatement(query);
		st.setInt(1,nu);
		st.setString(2, bname);
		st.setInt(3, amt);
		int count = st.executeUpdate();
		//int count1 = st.executeUpdate(query1);
		
		System.out.println(count + "rows affected");
		st.close();
		con.close();
		
		
		
	}
}