package ex01;

public class Jogador2 extends Esporte {
     public Jogador2() {
 		this.esporte = "Vôlei";
 		this.nome = "Lucarelli";
 		this.posicao = "Ponta";
 		this.time = "Cucine Lube Civitanova";
 		this.idade = 30;
     }
     
 	@Override //Sobrescrita dos métodos de Informações do Jogador
 	public void InfoJogador() {
 		System.out.println("\n=========================");
 		System.out.println("\nApresentando o jogador:");
 	}
 	
 	//Os métodos Esportista e InfoJogador é colocado em todas as outras classes, porém, com sáidas de informações diferentes -> Polimorfismo
 	public void Esportista() {
 		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosição: " + this.posicao + "\nTime: " + this.time + 
 				           "\nIdade: " + this.idade + " anos");
 	}
}
