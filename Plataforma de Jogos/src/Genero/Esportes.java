package Genero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Esportes {
	
	public String opcaojogo4;

	public Esportes() throws FileNotFoundException {
		
		File arquivo4 = new File("C:\\_ws\\Plataforma de Jogos\\Esportes.txt");
		Scanner esportes = new Scanner(arquivo4);
		
		while(esportes.hasNextLine()) {
			System.out.println(esportes.nextLine());
		}
		
		System.out.println("-- Quais Jogos você gostaria de comprar --");
		Scanner opcao4 = new Scanner(System.in);
		opcaojogo4 = opcao4.nextLine();
		System.out.println("Seu Carrinho - " + opcaojogo4);
		
	}
	
}
