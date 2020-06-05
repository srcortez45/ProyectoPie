package conexionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiondb {
	

	
	public static Connection conectar() {
		Connection conexion=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_usuarios","root","conexiondb125");
			System.out.println("conexion establecida");
			return conexion;
		} catch ( SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conexion;
		
	}
	
}
