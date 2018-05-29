package tictactoe.jogo;
/**
 * Essa classe define as Jogadas a serem usadas no jogo
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.0
 */
public class Jogada {
	protected int play;
	protected Tabuleiro tabuleiro = new Tabuleiro();

	/**
	 * Esse metodo define a coordenada selecionada pelo jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 */
	public void setCoordenada(int play) {
		this.play = play;
	}

	/**
	 * Esse metodo define a coordenada selecionada pelo jogador no tabuleiro
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @param player eh utilizado para controle dos jogadores
	 * @param value eh utilizada para o controle do caractere de cada jogador
	 */
	public void setOnTabuleiro(int player) {
		String value="";
		if (player == 1) 
			value = "X";
		if (player == 2)
			value = "O";
		switch(play) {
			case 1:
				tabuleiro.setPosicao(2,0,value);
				break;
			case 2:
				tabuleiro.setPosicao(2,1,value);
				break;
			case 3:
				tabuleiro.setPosicao(2,2,value);
				break;
			case 4:
				tabuleiro.setPosicao(1,0,value);
				break;
			case 5:
				tabuleiro.setPosicao(1,1,value);
				break;
			case 6:
				tabuleiro.setPosicao(1,2,value);
				break;
			case 7:
				tabuleiro.setPosicao(0,0,value);
				break;
			case 8:
				tabuleiro.setPosicao(0,1,value);
				break;
			case 9:
				tabuleiro.setPosicao(0,2,value);
				break;
		}
	}
}