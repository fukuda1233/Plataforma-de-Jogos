import java.io.IOException;
import java.util.Scanner;

import Add_Jogos.Add_jogos;
import Genero.Genero;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("");
		System.out.println("-------Plataforma Universal de Jogos-------");
		System.out.println("1 - Jogos - 2 - Generos - 3 - Add Jogos");
		System.out.println("");
	
		Scanner opcao = new Scanner(System.in);
		
		int escolha;
		escolha = opcao.nextInt();
		switch(escolha) {
		
		case 1:
			System.out.println("1 - Jogos ");
			System.out.println("----------------------------------------");
			
			Jogos s = new Jogos();
			
			break;
		case 2:
			System.out.println("2 - Generos ");
			System.out.println("----------------------------------------");
			
			Genero s2 = new Genero();
			
			break;
		case 3:
			System.out.println("3 - Add Jogos ");
			System.out.println("----------------------------------------");
			
			Add_jogos s3 = new Add_jogos();
			
			break;
		default:
			System.out.println("Opção Invalida");
		}
		
		opcao.close();
	}
	
}
