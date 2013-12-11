/*
 * The player Class
 * It contains the logic of each players type and return how many sticks are to be taken
 */
import java.util.Random;
import java.util.Scanner;

public class Player {

//	public void user(Grid tac) {
//		tac.print();
//
//	}

	public void random(Grid tac, TicTacToeSymbol.Symbol playerSymbol) {
		boolean sentinel = true;
		String symbol = "";

		if (playerSymbol == TicTacToeSymbol.Symbol.CIRCLE) {
			symbol = "circle";

		}

		while (sentinel == true) {

			Random rand = new Random();
			int random = rand.nextInt(9) + 1;

			switch (random) {
			case 1:
				if (tac.getSymbolof("one") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("one", symbol);
					sentinel = false;
				}
				break;
			case 2:
				if (tac.getSymbolof("two") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("two", symbol);
					sentinel = false;
				}
				break;
			case 3:
				if (tac.getSymbolof("three") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("three", symbol);
					sentinel = false;
				}
				break;
			case 4:
				if (tac.getSymbolof("four") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("four", symbol);
					sentinel = false;
				}
				break;
			case 5:
				if (tac.getSymbolof("five") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("five", symbol);
					sentinel = false;
				}
				break;
			case 6:
				if (tac.getSymbolof("six") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("six", symbol);
					sentinel = false;
				}
				break;
			case 7:
				if (tac.getSymbolof("seven") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("seven", symbol);
					sentinel = false;
				}
				break;
			case 8:
				if (tac.getSymbolof("eight") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("eight", symbol);
					sentinel = false;
				}
				break;
			case 9:
				if (tac.getSymbolof("nine") == TicTacToeSymbol.Symbol.SPACE) {
					tac.setSymbolOf("nine", symbol);
					sentinel = false;
				}
				break;
			default:
				System.err.println("YOU BROKE IT");

			}
		}

	}

//	public int smart(int totalSticks) {
//		int orginal = totalSticks;
//
//		return orginal - totalSticks;
//	}
}
