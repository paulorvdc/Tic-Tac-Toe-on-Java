package tictactoe.armazenamento;
import java.io.*;

/**
 * Essa classe implementa a interface GerenciaJogadores.
 * Essa classe salva em um arquivo .txt o nome dos jogadores 
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.1
 */

public class GerenciaJogadoresArquivo implements GerenciaJogadores {
	
	/**
	 * Esse metodo grava os dados dos jogadores em um arquivo de extensao .txt
	 * Esse metodo utiliza o tratamento de excessao usando try-catch
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 */
	
	public void gravaArquivo(String nomes){
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileOutputStream("jogadores.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Erro criando o arquivo de saída.");
			return;
		}
		outputStream.println(nomes);
		outputStream.close();
		return;
	}
}
