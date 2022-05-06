package ex01;

public class Main {
	public static void main(String[] args) {
		//Instância do objeto jogador
		Jogador1 j1 = new Jogador1();
		Jogador2 j2 = new Jogador2();
		Jogador3 j3 = new Jogador3();
		
		//puxando as informações declaradas no método Jogador
		j1.InfoJogador();
		j1.Esportista();
		
		j2.InfoJogador();
		j2.Esportista();
		
		j3.InfoJogador();
		j3.Esportista();
	}
}
