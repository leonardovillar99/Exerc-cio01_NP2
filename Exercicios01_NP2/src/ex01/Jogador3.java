package ex01;

public class Jogador3 extends Esporte {
    public Jogador3() {
		this.esporte = "Basquete";
		this.nome = "Stephen Curry";
		this.posicao = "Armador";
		this.time = "Golden State Warriors";
		this.idade = 34;
    }
    
	@Override //Sobrescrita dos m�todos de Informa��es do Jogador (Linha 13 e 20)
	public void InfoJogador() {
		System.out.println("\n=========================");
		System.out.println("\nApresentando o jogador:");
	}
	
	@Override
	//Os m�todos Esportista e InfoJogador s�o colocados em todas as outras classes, por�m, com s�idas diferentes -> Polimorfismo
	public void Esportista() {
		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosi��o: " + this.posicao + "\nTime: " + this.time + 
				           "\nIdade: " + this.idade + " anos");
	}
}
