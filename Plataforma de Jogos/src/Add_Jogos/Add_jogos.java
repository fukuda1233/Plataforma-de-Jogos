package Add_Jogos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Add_jogos {

	public Add_jogos() throws IOException {
		
		File arquivo5 = new File("C:\\_ws\\Plataforma de Jogos\\Jogos.csv");
		Scanner jogos2 = new Scanner(arquivo5);
		
		String fileContent = "1 Minecraft  - ;60.99";
		while(jogos2.hasNextLine()) {
			fileContent = fileContent.concat(jogos2.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("C:\\_ws\\Plataforma de Jogos\\Jogos_New.csv");
		writer.write(fileContent);
		writer.close();
		
		File arquivo6 = new File("C:\\_ws\\Plataforma de Jogos\\Jogos_New.csv");
		Scanner jogos3 = new Scanner(arquivo6);
		while(jogos3.hasNextLine()) {
			System.out.println(jogos3.nextLine());
		}
		
		System.out.println("---- Jogo Adicionado ----");
		
	}
	
}
