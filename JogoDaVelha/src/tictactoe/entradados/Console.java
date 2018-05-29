package tictactoe.entradados;
import java.util.*;

/**
 * Essa classe define os Comandos
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.0
 */

public class Console {
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * Esse metodo retorna um scanner de string
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @return scan
	 */
	
	public String stringScanner() {
		String scan = scanner.nextLine();
		return scan;
	}
	
	/**
	 * Esse metodo retorna um scanner de Int
	 * @author Enrique Augusto
	 * @author Paulo Ricardo
	 * @version 1.0
	 * @return scan 
	 */
	
	public int intScanner() {
		int scan = scanner.nextInt();
		return scan;
	}
}