import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) throws IOException {
		ArrayList<String> rCorreta = new ArrayList<String>();
		ArrayList<String> respostas = new ArrayList<String>();
 		Arquivos arquivo = new Arquivos();
		Scanner ler = new Scanner(System.in);
		int cont = 0;
		
		//Menu do Jogo
		System.out.println("*--------#--------*");
		System.out.println("Quiz de Perguntas:"
				+ "\n1 - Novo Jogo"
				+ "\n2 - Jogo salvo"
				+ "\n3 - Ranking"
				+ "\n4 - Sair");
		System.out.println("*--------#--------*");
		int escolha = ler.nextInt();
		
		switch(escolha){
		case 1:
			System.out.println("Digite seu nome:");
			String nome = ler.next();
			break;
		case 2:
			System.out.println("jogo salvo");
			break;
		case 3:
			System.out.println("Ranking");
			break;
		case 4:
			System.out.println("Vai embora mesmo, fracassado!");
		default:
			System.out.println("Opção inválida");	
		}
		
		// Gabarito
		rCorreta.add("a");
		rCorreta.add("c");
		rCorreta.add("c");
		rCorreta.add("a");
		rCorreta.add("e");
		rCorreta.add("b");
		rCorreta.add("b");
		rCorreta.add("c");
		rCorreta.add("d");
		rCorreta.add("a");
		
		
		for(int i = 0; i < rCorreta.size(); i++) {			
			arquivo.lerArquivo(i);
			String r = ler.next();			
			if (r.equals(rCorreta.get(i))) {
				cont++;
				respostas.add((i+1) + "-" + r);
			}
		}
		
		System.out.println("acertou " + cont);
		
		for(int i = 0; i < respostas.size(); i++) {
			System.out.println(respostas.get(i));
		}
		
		ler.close();
	}
}
