package tictactoe.jogo;

/**
 * Essa classe define o Tabuleiro a ser usado no jogo
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.1
 */

public class Tabuleiro {
	
	protected String[][] tabuleiro = new String[3][3];
	/**
	 * Esse metodo inicia as posicoes do tabuleiro com espacos vazios
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.1
	 */
	public Tabuleiro() {
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				tabuleiro[i][j] = " ";
			}
		}
	}
	
	/**
	 * Esse metodo salva a posicao no tabuleiro em uma jogada
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.1
	 */
	
	public void setPosicao(int x, int y, String value) {
		tabuleiro[x][y] = value;
	}

	/**
	 * Esse metodo resgata a posicao no tabuleiro
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.1
	 * @return tabuleiro [x][y]
	 */
	
	public String getPosicao(int value) {
		switch(value) {
		case 1:
			return tabuleiro[2][0];
		case 2:
			return tabuleiro[2][1];
		case 3:
			return tabuleiro[2][2];
		case 4:
			return tabuleiro[1][0];
		case 5:
			return tabuleiro[1][1];
		case 6:
			return tabuleiro[1][2];
		case 7:
			return tabuleiro[0][0];
		case 8:
			return tabuleiro[0][1];
		case 9:
			return tabuleiro[0][2];
		}
		return " ";
	}
	
	/**
	 * Esse metodo gera o tabuleiro
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.1
	 */
	public void tabuleiro() {
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				if (j == 1){
					System.out.printf("| %s |", tabuleiro[i][j]);
				}
				else{
					System.out.printf(" %s ", tabuleiro[i][j]);
				}
			}
			if (i !=2)
			System.out.printf("\n———————————\n");
		}
	}
}