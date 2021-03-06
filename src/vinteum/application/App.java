
/* *****************************************************************************
* Autor: Lucas Ara�jo, Idilene Brito, �lida Nunes, Caique Zogbi, Matheus Maia 
* Turma: 58271;
* Inicio: 04/04/2019;
* Ultima altera��o 08/04/2019; 
* Fun��o: Classe de aplica��o aonde ser� o rodado o console
* Finalidade do Software: Jogo Vinte Um de Boca
******************************************************************************** */

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
			while (menu ==true) {  					//enquanto a variavel "menu" for true o menu ser� exibido
				System.out.println("");
				System.out.println("");
				System.out.println("		Menu da aplica��o		");
				System.out.println("");
				System.out.println("	1 - jogar");
				System.out.println("	2 - Adicionar Jogador");
				System.out.println("	3 - listar jogadores");
				System.out.println("	4 - sair");
				System.out.println("");
				System.out.println("");
				
				System.out.print("	Digite op�ao: ");
				
				int opcao = 0;
				opcao = scan.nextInt();		//"opcao" recebe "scan.nextInt" que � responsvael na entrada de dado
				
				long id_jogadorJva = 0;
				String nome_jogadorJva = null;							//Zzerando os dados para n�o conflitarem
				int vitoria_jogadorJva = 0, derrota_jogadorJva = 0;
				
				//Estanciando classes
				Jogador j = new Jogador();
				JogadorDAO jDAO = new JogadorDAO();  //Eu errei o nome da classe jogadorDAO, ela esta escrita sem o ultimo r "JogadoDAO"
				
				Scanner string = new Scanner(System.in);
				
				String start = "on";
				
				switch (opcao) {
					case 1:	 //Jogo
						
						boolean menu2 = true;
							while (menu == true) {
								System.out.println("");
								System.out.println("");
								System.out.println("		Menu Jogar..");
								System.out.println("");
								System.out.println("	1 - jogar 1x1");
								System.out.println("	2 - vs maquina");
								System.out.println("");
								System.out.println("");
								
								System.out.print("	Digite op��o: ");
								
								int opc2 =0;
								opc2 = scan.nextInt();
							}
						
					
					break;
					
					case 2:  //Adicionar
						
						System.out.println("");
						System.out.println("");
						System.out.println("		Adicionar jogador..");
						System.out.println("");
						System.out.print("	Nome: ");
						nome_jogadorJva = string.nextLine();
						
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
