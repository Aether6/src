/*	
 * Here is class Symbol 
 * Its responsible for keeping track of what player the players are. Doesn't do much other then let me set the player 
 * and get what a player is, nice and simple.
 */

public class TicTacToeSymbol {

	public enum Symbol {
		CROSS, CIRCLE, SPACE,
	}

	private Symbol type = Symbol.SPACE;

	public void setSymbol(String yarn) {
		yarn = yarn.toUpperCase();
		
		if (yarn.equals("CIRCLE")) {
			type = Symbol.CIRCLE;
		} else if (yarn.equals("CROSS")) {
			type = Symbol.CROSS;
		} else {
			type = Symbol.SPACE;
		}
	}

	public Symbol getSymbol() {
		if (type == Symbol.CIRCLE) {
			return Symbol.CIRCLE;
		} else if (type == Symbol.CROSS) {
			return Symbol.CROSS;
		} else {
			return Symbol.SPACE;
		}
	}
	
	public String toString() {
		if (type == Symbol.CIRCLE) {
			return "O";
		} else if (type == Symbol.CROSS) {
			return "X";
		} else {
			return " ";
		}
	}
}
