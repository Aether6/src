/*
 * The player Class
 * It contains the logic of each players type and return how many sticks are to be taken
 */
import java.util.Random;
import java.util.Scanner;

public class Player {

	public Grid user(Grid tac, TicTacToeSymbol.Symbol playerSymbol) {
		boolean sentinel = true;
		String symbol = "cross";

		if (playerSymbol == TicTacToeSymbol.Symbol.CIRCLE) {
			symbol = "circle";

		}

		Scanner scan = new Scanner(System.in);
		System.out.println("\n Pick your place");
		tac.print();
		int number = scan.nextInt();

		while (sentinel == true) {
			switch (number) {
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
				System.err.println("No WAIT what are you doing!");
			}
		}
		return tac;
	}

	public Grid random(Grid tac, TicTacToeSymbol.Symbol playerSymbol) {
		boolean sentinel = true;
		String symbol = "cross";

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
		System.out.println(tac.print());
		return tac;
	}

	public Grid smart(Grid tac, TicTacToeSymbol.Symbol playerSymbol) {
		String symbol = "cross";

		if (playerSymbol == TicTacToeSymbol.Symbol.CIRCLE) {
			symbol = "circle";

		}

		if (tac.getSymbolof("five") == TicTacToeSymbol.Symbol.SPACE) {
			tac.setSymbolOf("five", symbol);
			return tac;
			
		} else if (!(four.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
			
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		} else if (!(eight.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& two.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		} else if (!(nine.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		} else if (!(one.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return tac;
		}
	}
}
