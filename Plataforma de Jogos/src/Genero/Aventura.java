package Genero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aventura {
	
	public String opcaojogo3;

	public Aventura() throws FileNotFoundException {
		
		File arquivo3 = new File("C:\\_ws\\Plataforma de Jogos\\Aventura.csv");
		Scanner aventura = new Scanner(arquivo3);
		
		while(aventura.hasNextLine()) {
			System.out.println(aventura.nextLine());
		}
		
		System.out.println("-- Quais Jogos você gostaria de comprar --");
		Scanner opcao3 = new Scanner(System.in);
		opcaojogo3 = opcao3.nextLine();
		System.out.println("Seu Carrinho - " + opcaojogo3);
		
	}
	
}
