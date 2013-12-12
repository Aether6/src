/*
 * 
 */
public class Grid {

	private TicTacToeSymbol one = new TicTacToeSymbol();
	private TicTacToeSymbol two = new TicTacToeSymbol();
	private TicTacToeSymbol three = new TicTacToeSymbol();
	private TicTacToeSymbol four = new TicTacToeSymbol();
	private TicTacToeSymbol five = new TicTacToeSymbol();
	private TicTacToeSymbol six = new TicTacToeSymbol();
	private TicTacToeSymbol seven = new TicTacToeSymbol();
	private TicTacToeSymbol eight = new TicTacToeSymbol();
	private TicTacToeSymbol nine = new TicTacToeSymbol();

	public String print() {
		String yarn = "|" + seven + "|" + eight + "|" + nine + "|\n" + "|"
				+ four + "|" + five + "|" + six + "|\n" + "|" + one + "|" + two
				+ "|" + three + "|";
		return yarn;
	}
	
	public boolean didCircleWin() {
		
		if (!(one.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& two.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(four.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(eight.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& two.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(nine.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		} else if (!(one.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CIRCLE) {
			return true;
		}
		
		return false;
	}
	
	public boolean didCrossWin() {
		
		if (!(one.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& two.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(four.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& four.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(eight.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& eight.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& two.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(nine.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& six.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(seven.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& seven.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& three.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		} else if (!(one.getSymbol() == TicTacToeSymbol.Symbol.SPACE)
				&& one.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& five.getSymbol() == TicTacToeSymbol.Symbol.CROSS
				&& nine.getSymbol() == TicTacToeSymbol.Symbol.CROSS) {
			return true;
		}
		
		return false;
	}

	public void setSymbolOf(String number, String symbol) {
		number = number.toLowerCase();

		switch (number) {
		case "one":
			one.setSymbol(symbol);
			break;
	
		case "two":
			two.setSymbol(symbol);
			break;
			
		case "three":
			three.setSymbol(symbol);
			break;
			
		case "four":
			four.setSymbol(symbol);
			break;
			
		case "five":
			five.setSymbol(symbol);
			break;
			
		case "six":
			six.setSymbol(symbol);
			break;
			
		case "seven":
			seven.setSymbol(symbol);
			break;
			
		case "eight":
			eight.setSymbol(symbol);
			break;
			
		case "nine":
			nine.setSymbol(symbol);
			break;
			
		default:
			System.err.println("SET MADNESS");
		}
	}

	public TicTacToeSymbol.Symbol getSymbolof(String number) {

		switch (number) {
		case "one":
			return one.getSymbol();		
		case "two":
			return two.getSymbol();
		case "three":
			return three.getSymbol();
		case "four":
			return four.getSymbol();
		case "five":
			return five.getSymbol();
		case "six":
			return six.getSymbol();
		case "seven":
			return seven.getSymbol();
		case "eight":
			return eight.getSymbol();
		case "nine":
			return nine.getSymbol();
		default:
			System.err.println("GET MADNESS");
			return TicTacToeSymbol.Symbol.SPACE;

		}
	}
}
