package vinteum.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost:3306/jogo"; //FAVOR TROCAR O PORT CASO EDITANDO EM OUTRA MAQUINA
	
	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

}
