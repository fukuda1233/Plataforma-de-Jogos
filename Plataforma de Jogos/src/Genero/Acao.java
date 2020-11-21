package Genero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Acao {
	
	public String opcaojogo2;
	
	public Acao() throws FileNotFoundException {
		
		File arquivo2 = new File("C:\\_ws\\Plataforma de Jogos\\Acao.csv");
		Scanner acao = new Scanner(arquivo2);
		
		while(acao.hasNextLine()) {
			System.out.println(acao.nextLine());
		}
		
		System.out.println("-- Quais Jogos você gostaria de comprar --");
		Scanner opcao2 = new Scanner(System.in);
		opcaojogo2 = opcao2.nextLine();
		System.out.println("Seu Carrinho - " + opcaojogo2);
		
	}
	
}
