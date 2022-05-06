package ex01;

public class Jogador1 extends Esporte {
	 public Jogador1() {
		this.esporte = "Futebol";
		this.nome = "Messi";
		this.posicao = "Atacante";
		this.time = "PSG";
		this.idade = 34;		
	}
	
	@Override //Sobrescrita dos métodos de Informações do Jogador
	public void InfoJogador() {
		System.out.println("Apresentando o jogador:");
	}
	
	//Os métodos Esportista e InfoJogador é colocado em todas as outras classes, porém, com sáidas de informações diferentes -> Polimorfismo
	public void Esportista() {
		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosição: " + this.posicao + "\nTime: " + this.time + 
				           "\nIdade: " + this.idade + " anos");
	}
	
}
