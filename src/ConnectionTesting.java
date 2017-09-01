import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTesting {
	public static void main(String args[]) throws SQLException 
	{
		try
		{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		conn.close();
		System.out.println("Connection Done");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
