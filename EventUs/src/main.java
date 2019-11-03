import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		createTable();
	}
	
	public static void createTable() throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS spaces(idSpace int NOT NULL AUTO_INCREMENT, name varchar(255), address varchar(255), capacity int, resources varchar(255), PRIMARY KEY(idSpace)");
			create.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally{
			System.out.println("Function complete.");
		};
		//lo mismo con eventos
	}
	
	public static Connection getConnection() throws Exception{
		
		try {
			String driver= "com.mysql.jbdc.Driver";
			String url = "jbdc:mysql://localhost:3306/database";
			String username = "fellowship";
			String password = "eventus";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		}catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
