import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) throws IOException {
		String gabarito [] = {"a", "c", "c", "a", "e", "b", "b", "c", "d", "a"};
		ArrayList<String> respostas = new ArrayList<String>();
 		Arquivos arquivo = new Arquivos();
		Scanner ler = new Scanner(System.in);
		int cont = 0;
		String nome = null;
		int escolha = 0;
				
		int[] surrogates = {0xDC7D};
		String alienEmojiString = new String(surrogates, 0, surrogates.length);
		//Menu do Jogo
			while(escolha != 3) {
				System.out.println("*--------#--------*");
				System.out.println("Quiz de Perguntas:"
						+ "\n1 - Novo Jogo"
						+ "\n2 - Ranking"
						+ "\n3 - Sair");
				System.out.println("*--------#--------*");
				escolha = ler.nextInt();
				
				switch(escolha){
				case 1:
					System.out.println("Digite seu nome:");
					nome = ler.next().toLowerCase();
					
					arquivo.criarArquivoRank();
					
					for(int i = 0; i < gabarito.length; i++) {			
						arquivo.lerArquivo(i);
						String r = ler.next();			
						if (r.equals(gabarito[i])) {
							cont++;
							respostas.add((i+1) + "-" + r);
						}
					}
					
					arquivo.escreverRank(cont);
					
					System.out.println("acertou " + cont);
					
					if(cont >= 8) {
						System.out.println("Parábens " + nome + " você foi muito bem");
					}
					
					if(cont > 0) {
						System.out.println("Gabarito das respostas corretas:");
						for(int i = 0; i < respostas.size(); i++) {
							System.out.println(respostas.get(i));
						}
					}
					
					break;
				case 2:
					arquivo.lerRank();			
					break;
				case 3:
					System.out.println("Vai embora mesmo, fracassado!" + alienEmojiString);
					break;
				default:
					System.out.println("Opção invalida");	
				}
				
			}	
		
		ler.close();
	}
	}
