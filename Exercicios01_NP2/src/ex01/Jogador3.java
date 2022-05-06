package ex01;

public class Jogador3 extends Esporte {
    public Jogador3() {
		this.esporte = "Basquete";
		this.nome = "Stephen Curry";
		this.posicao = "Armador";
		this.time = "Golden State Warriors";
		this.idade = 34;
    }
    
	@Override //Sobrescrita dos m�todos de Informa��es do Jogador
	public void InfoJogador() {
		System.out.println("\n=========================");
		System.out.println("\nApresentando o jogador:");
	}
	
	//Os m�todos Esportista e InfoJogador � colocado em todas as outras classes, por�m, com s�idas de informa��es diferentes -> Polimorfismo
	public void Esportista() {
		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosi��o: " + this.posicao + "\nTime: " + this.time + 
				           "\nIdade: " + this.idade + " anos");
	}
}
