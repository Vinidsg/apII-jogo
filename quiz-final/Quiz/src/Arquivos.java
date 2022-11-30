import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Arquivos {
	
	public void lerArquivo(int i) throws IOException {
		
		switch (i) {
		case 0:
			Path path = Path.of("./perguntas/1-pergunta.txt");
			String conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 1:
			path = Path.of("./perguntas/2-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 2:
			path = Path.of("./perguntas/3-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);	
			break;
		case 3:
			path = Path.of("./perguntas/4-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 4:
			path = Path.of("./perguntas/5-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 5:
			path = Path.of("./perguntas/6-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 6:
			path = Path.of("./perguntas/7-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 7:
			path = Path.of("./perguntas/8-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 8:
			path = Path.of("./perguntas/9-pergunta.txt");
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		case 9:
			path = Path.of("./perguntas/10-pergunta.txt");  
			conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
			}
		}
	
	public void criarArquivoRank() throws IOException {
		Path file = Path.of("./rank.txt");
		
		if(!Files.exists(file))
			Files.createFile(file);
		}
		
	

	public void escreverRank(int cont) throws IOException {
		FileWriter writer = new FileWriter("./rank.txt", true);
		
			writer.append(cont + "\r\n");
			
			writer.close();
		}
	
	public void lerRank() throws IOException {
		Path arq = Paths.get("./rank.txt");

		if(Files.exists(arq)) {
			BubbleSort ordenar = new BubbleSort();
			Scanner ler = new Scanner(arq);
		    long count = Files.lines(arq).count();
			int vetor[] = new int[(int) count];
			
			int j = 0;
			while(ler.hasNext()) {
				int data = ler.nextInt();							
					vetor[j++] = data;
			}
			
			ordenar.bubbleSort(vetor);
			ler.close();
				
			} else {
				System.out.println("Ranking não existe, efetuei uma jogada.");
			}
	}
	
	public void AlterarRank(int vetor[]) throws IOException {
		Path arq = Paths.get("./rank.txt");
		Files.delete(arq);
		
		Files.createFile(arq);
		
		FileWriter writer = new FileWriter("./rank.txt", true);
		
		for(int i=0; i < vetor.length; i++)
			writer.append(vetor[i] + "\r\n");
		writer.close();
		
		System.out.println(Files.readString(arq, StandardCharsets.ISO_8859_1));
	}
	
	
	
	
		
	}

