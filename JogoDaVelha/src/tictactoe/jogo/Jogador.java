package tictactoe.jogo;

/**
 * Essa classe define os Jogadores
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.0
 */

public class Jogador {
	protected String jogador1;
	protected String jogador2;
	protected int j;

	/**
	 * Esse metodo define o nome de um jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @param j eh utilizado para definir que o jogador com recebido nesse metodo eh o jogador 1
	 * (j eh utilizado no metodo get jogador)
	 */
	public void setJogador1(String nome) {
		this.jogador1 = nome;
		j=1;
	}

	/**
	 * Esse metodo define o nome de um segundo jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @param j eh utilizado para definir que o jogador com recebido nesse metodo eh o jogador 2
	 * (j eh utilizado no metodo get jogador)
	 */
	public void setJogador2(String nome) {
		this.jogador2 = nome;
		j=2;
	}

	/**
	 * Esse metodo resgata o nome do primeiro jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @return jogador1
	 */
	
	public String getJogador1() {
		return jogador1;
	}

	/**
	 * Esse metodo resgata o nome do segundo jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @return jogador2
	 */
	
	public String getJogador2() {
		return jogador2;
	}
	
	/**
	 * Esse metodo resgata o "valor"(1 ou 2) do jogador
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @return J
	 */
	
	public int getJogador() {
		return j;
	}
}
