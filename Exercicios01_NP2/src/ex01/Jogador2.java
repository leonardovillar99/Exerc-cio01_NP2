package ex01;

public class Jogador2 extends Esporte {
     public Jogador2() {
 		this.esporte = "V?lei";
 		this.nome = "Lucarelli";
 		this.posicao = "Ponta";
 		this.time = "Cucine Lube Civitanova";
 		this.idade = 30;
     }
     
 	@Override //Sobrescrita dos m?todos de Informa??es do Jogador (Linha 13 e 20)
 	public void InfoJogador() {
 		System.out.println("\n=========================");
 		System.out.println("\nApresentando o jogador:");
 	}
 	
 	@Override
 	//Os m?todos Esportista e InfoJogador s?o colocados em todas as outras classes, por?m, com s?idas diferentes -> Polimorfismo
 	public void Esportista() {
 		System.out.println("\nEsporte Praticado: " + this.esporte + "\nNome: " + this.nome + "\nPosi??o: " + this.posicao + "\nTime: " + this.time + 
 				           "\nIdade: " + this.idade + " anos");
 	}
}
