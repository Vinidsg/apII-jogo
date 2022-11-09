import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos {

	public void lerArquivo(int i) throws IOException {

		switch (i) {
		case 0:
			Path path = Path.of("C:\\Users\\vinic\\OneDrive\\Área de Trabalho\\perguntas\\1-pergunta.txt");
			String conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
			System.out.println(conteudo);
			break;
		/*case 1:
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
			break;*/
		}
	}

	public void escreverRank(int cont, String nome) throws IOException {
		Path diretorioAtual = Paths.get(".");
		boolean encontrado;

		try (DirectoryStream<Path> file = Files.newDirectoryStream(diretorioAtual, "ranking.txt")) {
			for (Path arquivo : file)
				System.out.println(arquivo.normalize().toAbsolutePath());
			encontrado = true;
		}

		if (!encontrado) {

		} else {

		}

	}

}