import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Arquivo {
	
	public Arquivo() {
		
	}
	
	public void lerArquivo() throws IOException {
		Perguntas pergunta = new Perguntas();
		Path path = Path.of("./Quiz.txt");
		
		Scanner ler = new Scanner(path);
		
		while(ler.hasNext()) {
			String data = ler.nextLine();
			
			if (data.contains("?")) {
				pergunta.setTitulo(data);
				
			} else if (data.contains("A -")) {
				pergunta.setAlternativaA(data);
				
			} else if (data.contains("B -")) {
				pergunta.setAlternativaB(data);
				
			} else if (data.contains("C -")) {
				pergunta.setAlternativaC(data);
				
			} else if (data.contains("D -")) {
				pergunta.setAlternativaD(data);
				
			}
		}
		
		ler.close();

		}
	
	public void escreverArquivo() {
		
	}
	
}
