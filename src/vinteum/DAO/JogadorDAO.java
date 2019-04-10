package vinteum.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vinteum.factory.ConexaoFactory;
import vinteum.jogador.Jogador;



public class JogadorDAO {
	
	//SALVAR JOGADOR
	public void salvarJog(Jogador j) throws SQLException {					//botões rapidos:  ? /
		
		StringBuilder sql = new StringBuilder();
		sql.append("CALL `jogo`.`PROC_SALVAR_JOGADOR`(?);");
		
		Connection conexao = ConexaoFactory.conectar();  	// Linha de comando que abre conexão
		
		try {
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			
			comando.setString(1, j.getNome_jogadorJva());			//Setando e pegando informações do jogador

			
			comando.executeQuery();
			
			System.out.println("");
			System.out.println("");
			System.out.println("	Jogador Adicionado!");
			System.out.println("");
			System.out.println("");
			
			
		} catch (Exception exception) {
			exception.printStackTrace();
			System.out.println("	Dev/: Erro ao adicionar jogador, favor olhar console");
			System.out.println("	Usuario/: Erro ao adicionar jogador!");
			System.out.println("");
			System.out.println("");
		}
		
		
	}
	
	//LISTAR JOGADOR
	public ArrayList<Jogador> listar() throws SQLException{		//ArrayList precisa retornar algo, erro persiste até ser retornado algo
		
		StringBuilder sql = new StringBuilder();
		sql.append("CALL `jogo`.`PROC_LISTAR_JOGADOR`();");  //Chamando a procedure com o "append"
		
		Connection conexao = ConexaoFactory.conectar();
		
		ArrayList<Jogador> lista = new ArrayList<Jogador>();  //Criando um ArrayList do tipo Jogador
		
		try {
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			
			ResultSet result = comando.executeQuery();
				while (result.next()) {
					Jogador jogador = new Jogador();
					jogador.setId_jogadorJva(result.getLong(1));
					jogador.setNome_jogadorJva(result.getString(2));
					jogador.setVitoria_jogadorJva(result.getInt(3));
					jogador.setDerrota_jogadorJva(result.getInt(4));
					
					lista.add(jogador);  //Adicionando o objeto "jogador" no ArrayList "lista"
				}
			
		} catch (Exception exception) {
			exception.printStackTrace();
			System.out.println(" DEV/: Impossivel trazer lista, favor olhar o console.log");
		}
		
		return lista;  //por final retornamos a lista.
		
		
	}

}
