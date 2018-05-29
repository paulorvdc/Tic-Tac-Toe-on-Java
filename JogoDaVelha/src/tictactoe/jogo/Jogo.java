package tictactoe.jogo;
import tictactoe.excecoes.*;

import tictactoe.entradados.Console;


import tictactoe.armazenamento.*;

/**
 * Essa classe contem a logica do jogo
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.2
 */

public class Jogo {
	protected Jogada jogada = new Jogada();
	protected Console console = new Console();
	protected Jogador j1 = new Jogador();
	protected Jogador j2 = new Jogador();
	protected GerenciaJogadoresArquivo gerencia = new GerenciaJogadoresArquivo();
	
	/**
	 * Esse metodo gera o menu para o usuario
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.1
	 */
	
	public void menu() {
		System.out.println("Jogo da Velha em Java");
		System.out.println("v0");
		System.out.println("Digite o nome do Jogador 1:");
		//nome jogador1
		String aux1 = console.stringScanner();
		j1.setJogador1(aux1);
		System.out.println("Digite o nome do Jogador 2:");
		//nome jogador2
		String aux2 = console.stringScanner();
		j2.setJogador2(aux2);
		String aux3 = "";
		aux3 = aux1 + " " + aux2;
		gerencia.gravaArquivo(aux3);
	}
	
	/**
	 * Esse metodo contem os scanners e a verificacao das jogadas
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.3
	 * @param continuaLoop1 usado para controlar o loop do jogador 1
	 * @param contiluaLoop2 usado para controlar o loop do jogador 2
	 */
	
	public void receberJogada() {
		while (verificarVitoria() == false || isFull() == true) {
			//jogada jogador1
			System.out.println();
			boolean continuaLoop1 = true;
			boolean continuaLoop2 = true;
			do {
				try {
					System.out.println(j1.jogador1 + " faça sua jogada:");
					jogada.setCoordenada(console.intScanner());
					if (!(jogada.tabuleiro.getPosicao(jogada.play).equals(" ")))
						throw new PosicaoNotEmptyException();
					if (jogada.play > 9 || jogada.play < 1)
						throw new PosicaoInvalidaException();
					else {
						jogada.setOnTabuleiro(j1.j);
						jogada.tabuleiro.tabuleiro();
						System.out.println();
						if (verificarVitoria())
							System.out.println("Vitoria!");
						continuaLoop1 = false;
					}
				}
				catch (PosicaoNotEmptyException exc) {
					System.out.println(exc);
				}
				catch (PosicaoInvalidaException exc) {
					System.out.println(exc);
				}
			} while (continuaLoop1);
			if (verificarVitoria() == true || isFull() == true) {
				if (isFull() == true)
					System.out.println("Empate!");
				return;
			}
			//jogada jogador 2
			System.out.println();
			do {
				try {
					System.out.println(j2.jogador2 + " faça sua jogada:");
					jogada.setCoordenada(console.intScanner());
					if (!(jogada.tabuleiro.getPosicao(jogada.play).equals(" ")))
						throw new PosicaoNotEmptyException();
					if (jogada.play > 9 || jogada.play < 1)
						throw new PosicaoInvalidaException();
					else {
						jogada.setOnTabuleiro(j2.j);
						jogada.tabuleiro.tabuleiro();
						System.out.println();
						if (verificarVitoria() == true)
							System.out.println("Vitoria!");
						continuaLoop2 = false;
					}
				}
				catch (PosicaoNotEmptyException exc) {
					System.out.println(exc);
				}
				catch (PosicaoInvalidaException exc) {
					System.out.println(exc);
				}
			} while (continuaLoop2);
			if (verificarVitoria() == true || isFull() == true) {
				if (isFull() == true)
					System.out.println("Empate!");
				return;
			}
		} 
	}
	
	/**
	 * Esse metodo contem os scanners e a verificacao das jogadas
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.3
	 * @return Boolean
	 */
	
	public boolean verificarVitoria() {
		int i;
		int j;
		for(j=0; j < 3; j++) {
			if("X".equals(jogada.tabuleiro.tabuleiro[0][j]))
				if(jogada.tabuleiro.tabuleiro[0][j].equals(jogada.tabuleiro.tabuleiro[1][j]) &&
				   jogada.tabuleiro.tabuleiro[1][j].equals(jogada.tabuleiro.tabuleiro[2][j])) {
					System.out.println("Parabens " + j1.jogador1 + "!");
					return true;
				}
			if("O".equals(jogada.tabuleiro.tabuleiro[0][j]))
				if(jogada.tabuleiro.tabuleiro[0][j].equals(jogada.tabuleiro.tabuleiro[1][j]) &&
				   jogada.tabuleiro.tabuleiro[1][j].equals(jogada.tabuleiro.tabuleiro[2][j])) {
					System.out.println("Parabens " + j2.jogador2 + "!");
					return true;
				}
		}
		for(i=0; i < 3; i++) {
			if("X".equals(jogada.tabuleiro.tabuleiro[i][0]))
				if(jogada.tabuleiro.tabuleiro[i][0].equals(jogada.tabuleiro.tabuleiro[i][1]) && 
				   jogada.tabuleiro.tabuleiro[i][1].equals(jogada.tabuleiro.tabuleiro[i][2])) {
					System.out.println("Parabens " + j1.jogador1 + "!");
					return true;
				}
		if("O".equals(jogada.tabuleiro.tabuleiro[i][0]))
				if(jogada.tabuleiro.tabuleiro[i][0].equals(jogada.tabuleiro.tabuleiro[i][1]) && 
				   jogada.tabuleiro.tabuleiro[i][1].equals(jogada.tabuleiro.tabuleiro[i][2])) {
					System.out.println("Parabens " + j2.jogador2 + "!");
					return true;
				}
		}
		if("X".equals(jogada.tabuleiro.tabuleiro[0][0]))
			if (jogada.tabuleiro.tabuleiro[0][0].equals(jogada.tabuleiro.tabuleiro[1][1]) && 
			    jogada.tabuleiro.tabuleiro[1][1].equals(jogada.tabuleiro.tabuleiro[2][2])) {
				System.out.println("Parabens " + j1.jogador1 + "!");
				return true;
			}
		if("O".equals(jogada.tabuleiro.tabuleiro[0][0]))
			if (jogada.tabuleiro.tabuleiro[0][0].equals(jogada.tabuleiro.tabuleiro[1][1]) && 
				jogada.tabuleiro.tabuleiro[1][1].equals(jogada.tabuleiro.tabuleiro[2][2])) {
				System.out.println("Parabens " + j2.jogador2 + "!");
				return true;
			}
		if("X".equals(jogada.tabuleiro.tabuleiro[0][2]))
			if(jogada.tabuleiro.tabuleiro[0][2].equals(jogada.tabuleiro.tabuleiro[1][1]) && 
			   jogada.tabuleiro.tabuleiro[1][1].equals(jogada.tabuleiro.tabuleiro[2][0])) {
				System.out.println("Parabens " + j1.jogador1 + "!");
				return true;
			}
		if("O".equals(jogada.tabuleiro.tabuleiro[0][2]))
			if(jogada.tabuleiro.tabuleiro[0][2].equals(jogada.tabuleiro.tabuleiro[1][1]) && 
			   jogada.tabuleiro.tabuleiro[1][1].equals(jogada.tabuleiro.tabuleiro[2][0])) {
				System.out.println("Parabens " + j2.jogador2 + "!");
				return true;
			}
		return false;
	}
	
	/**
	 * Esse metodo contem os scanners e a verificacao das jogadas
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.3
	 * @param controle Utilizada para verificar se o campo esta cheio ou nao
	 * @return Boolean controle
	 */
	
	public boolean isFull() {
		boolean controle = true;
			for (int i = 0 ; i < 3 ; i++) {
				for (int j = 0 ; j < 3 ; j++) {
					if (jogada.tabuleiro.tabuleiro[i][j] == " ") {
						controle = false;
					}
				}
			}
		return controle;
	}
}
