
//DAO = Data Access Object

package jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JDBC DAO");
		
		BankDAO dao = new BankDAO();
		Bank b1 = dao.getBank(1);
		System.out.println(b1.bname);
	}

}


class BankDAO
{
	public Bank getBank (int serialno) 
	{
		try
		{
			String query = "select bname from banks_small where serialno =" + serialno;
			Bank b = new Bank();
			b.serialno = serialno;
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "rootroot");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			b.bname = name;
			return b;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return null;
	}
}

class Bank
{
	int serialno;
	String bname;
}
