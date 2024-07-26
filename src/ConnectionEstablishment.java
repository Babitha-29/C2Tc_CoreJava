import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionEstablishment {

	public static Connection conn() throws Exception {
		String url="jdbc:mysql://localhost:3306/employee_details";
		String username="root";
		String password="12345";
		Connection con=DriverManager.getConnection(url,username,password);
		//Statement st=con.createStatement();
		return con;
	}

}
