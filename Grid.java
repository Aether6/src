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
