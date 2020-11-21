import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jogos {
	
	public String opcaojogo;
	
	public Jogos() throws FileNotFoundException {
		
		File arquivo = new File("C:\\_ws\\Plataforma de Jogos\\Jogos.csv");
		Scanner jogos = new Scanner(arquivo);
		
		while(jogos.hasNextLine()) {
			System.out.println(jogos.nextLine());
		}
		
		System.out.println("-- Quais Jogos você gostaria de comprar --");
		Scanner opcao = new Scanner(System.in);
		opcaojogo = opcao.nextLine();
		System.out.println("Seu Carrinho - " + opcaojogo);
		
	}
	
}
