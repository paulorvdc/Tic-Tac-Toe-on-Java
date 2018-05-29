package tictactoe.jogo;

/**
 * Essa classe que contem o metodo main.
 * Utilizada para chamar os metodos para a inicializacao do jogo
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.3
 * @param jogo do tipo Jogo
 */

public class ClassePrincipal {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.menu();
		jogo.jogada.tabuleiro.tabuleiro();
		jogo.receberJogada();
	}
}
