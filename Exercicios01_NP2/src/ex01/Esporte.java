package ex01;

//Classe abstrata Esporte, onde não se pode criar um objeto a partir dela.
public abstract class Esporte {
	  protected String esporte;
      protected String nome;
      protected String posicao;
      protected String time;
      protected int idade;
	
      public abstract void InfoJogador();
      public abstract void Esportista();
}
