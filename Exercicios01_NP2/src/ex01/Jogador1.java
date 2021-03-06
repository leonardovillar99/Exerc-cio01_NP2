package ex01;

public class Jogador1 extends Esporte {
	 public Jogador1() {
		this.esporte = "Futebol";
		this.nome = "Messi";
		this.posicao = "Atacante";
		this.time = "PSG";
		this.idade = 34;		
	}
	
	@Override //Sobrescrita dos m?todos de Informa??es do Jogador (Linha 13 e 20)
	public void InfoJogador() {
		System.out.println("Apresentando o jogador:");
	}
	
	@Override
	//Os m?todos Esportista e InfoJogador s?o colocados em todas as outras classes, por?m, com s?idas diferentes -> Polimorfismo
	public void Esportista() {
		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosi??o: " + this.posicao + "\nTime: " + this.time + 
				           "\nIdade: " + this.idade + " anos");
	}
	
}
