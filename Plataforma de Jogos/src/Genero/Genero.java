package Genero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Genero {
	
	public Genero() throws FileNotFoundException {
		
		System.out.println("-- Qual Genero voc� est� procurando --");
		System.out.println(" 1 - A��o - 2 - Esportes - 3 - Aventura ");
		
		Scanner opcao = new Scanner(System.in);
		
		int escolha;
		escolha = opcao.nextInt();
		switch(escolha) {
		
		case 1:
			System.out.println("1 - A��o ");
			System.out.println("----------------------------------------");
			
			Acao s22 = new Acao();
			
			break;
		case 2:
			System.out.println("2 - Esportes ");
			System.out.println("----------------------------------------");
			
			Esportes s23 = new Esportes();
			
			break;
		case 3:
			System.out.println("3 - Aventura ");
			System.out.println("----------------------------------------");
			
			Aventura s24 = new Aventura();
			
			break;
		default:
			System.out.println("Op��o Invalida");
		}
		
		opcao.close();
	}
}
