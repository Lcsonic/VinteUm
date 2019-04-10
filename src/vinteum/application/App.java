
/* *****************************************************************************
* Autor: Lucas Araújo, Idilene Brito, Élida Nunes, Caique Zogbi, Matheus Maia 
* Turma: 58271;
* Inicio: 04/04/2019;
* Ultima alteração 08/04/2019; 
* Função: Classe de aplicação aonde será o rodado o console
* Finalidade do Software: Jogo Vinte Um de Boca
******************************************************************************** */

/*
ANOTAÇÃO IMPORTANTE
	CASO ERRO EM IMPORTAÇÃO SEGUIR OS PASSOS:
		1 - clique com o direito no projeto;
		2 - Va me build path;
		3 - Dentro do build path, abrir Libaries;
		4 - Add libarie, JRE library.
*/

package vinteum.application;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import vinteum.DAO.JogadorDAO;
import vinteum.jogador.Jogador;


public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);	
		
		boolean menu = true;
			while (menu ==true) {  					//enquanto a variavel "menu" for true o menu será exibido
				System.out.println("");
				System.out.println("");
				System.out.println("		Menu da aplicação		");
				System.out.println("");
				System.out.println("	Digite uma opção:			");
				System.out.println("");
				System.out.println("	1 - jogar");
				System.out.println("	2 - Adicionar Jogador");
				System.out.println("	3 - listar jogadores");
				System.out.println("	4 - sair");
				System.out.println("");
				System.out.println("");
				
				System.out.print("	Digite opçao: ");
				
				int opcao = scan.nextInt();		//"opcao" recebe "scan.nextInt" que é responsvael na entrada de dado
				
				long id_jogadorJva = 0;
				String nome_jogadorJva = null;							//Zzerando os dados para não conflitarem
				int vitoria_jogadorJva = 0, derrota_jogadorJva = 0;
				
				//Estanciando classes
				
				Jogador j = new Jogador(nome_jogadorJva);
				
				JogadorDAO jDAO = new JogadorDAO();  
				
				Scanner string = new Scanner(System.in);
				
				String start = "on";
				
				switch (opcao) {
					case 1:	 //Jogo
						System.out.println("		Começar a jogar..		");
						System.out.println("");
						System.out.println("	Digite uma opção:			");
						System.out.println("");
						System.out.println("	1 - jogar 2x2");
						System.out.println("	2 - jogar vs Maquina");
						System.out.println("");
						System.out.println("");
						
						//Resposta
						System.out.print("	Digite opçao: ");
						
						int opcao2 = scan.nextInt();
						
						String start2 = "on";
						
						switch(opcao2) {
						
							case 1:
								
								
								
							break;
							
							case 2:
								
								
								
							break;
						
						}
						
						
						
					break;
					
					case 2:  //Adicionar
						
						System.out.println("");
						System.out.println("");
						System.out.println("		Adicionar jogador..");
						System.out.println("");
						System.out.print("	Nome: ");
						nome_jogadorJva = string.nextLine();
						
						j = new Jogador(nome_jogadorJva);
						jDAO = new JogadorDAO();
						jDAO.salvarJog(j);
						
					break;
					
					case 3:  //Listar()
						
						jDAO = new JogadorDAO();
						
						ArrayList<Jogador> list = jDAO.listar();
						
						System.out.println("");
						System.out.println("");
						System.out.println("		Lista de jogadores..");
						System.out.println("");
						System.out.println("");
						
						
						for (int i = 0; i < list.size(); i++) {
							
							System.out.println("ID: " + list.get(i).getId_jogadorJva() + " |"
											+ "NOME: " + list.get(i).getNome_jogadorJva() + " |"
											+ "VITORIAS: " + list.get(i).getVitoria_jogadorJva() + " |"
											+ "DERROTAS: " + list.get(i).getDerrota_jogadorJva());
							
						}
						
						System.out.println("");
						System.out.println("");
						System.out.println("		Voltando ao menu inicial..");
						
						
						
					break;
				}
				
			}

	}

}
