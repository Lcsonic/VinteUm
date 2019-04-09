package vinteum.jogador;

public class Jogador {
	
	private long id_jogadorJva;
	private String nome_jogadorJva;		//Variavei com sufixos "Jva"
	private int vitoria_jogadorJva;		//são variaveis do Java para 
	private int derrota_jogadorJva;		//diferenciar das do banco
										
	public long getId_jogadorJva() {
		return id_jogadorJva;
	}
	public void setId_jogadorJva(long id_jogadorJva) {
		this.id_jogadorJva = id_jogadorJva;
	}
	public String getNome_jogadorJva() {
		return nome_jogadorJva;
	}
	public void setNome_jogadorJva(String nome_jogadorJva) {
		this.nome_jogadorJva = nome_jogadorJva;
	}
	public int getVitoria_jogadorJva() {
		return vitoria_jogadorJva;
	}
	public void setVitoria_jogadorJva(int vitoria_jogadorJva) {
		this.vitoria_jogadorJva = vitoria_jogadorJva;
	}
	public int getDerrota_jogadorJva() {
		return derrota_jogadorJva;
	}
	public void setDerrota_jogadorJva(int derrota_jogadorJva) {
		this.derrota_jogadorJva = derrota_jogadorJva;
	}
	
	

}