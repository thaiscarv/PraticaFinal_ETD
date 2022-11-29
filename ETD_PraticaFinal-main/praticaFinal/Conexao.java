package praticaFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
	
	static final String host = "jdbc:postgresql://localhost:3030/Dataset_Supermercados";
    static final String user = "admin";
    static final String password = "admin";
	
	public Connection conectaDB() {
		Connection conn = null;

		public static Connection getConnection(){
		try {
			String url = "jdbc:mysql://localhost:3306/Dataset_Supermercados?user=root&password=";
			conn = DriverManager.getConnection(url);
		} catch(SQLException erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		return conn;
		}
	}
}