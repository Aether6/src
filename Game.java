/*
 * 
 * @author Chase Nielson
 * Plays a game of MatchSticks, It only supports two players right now.
 *
 */
public class Game {

	public String numToPrint(int number) {
		String words;
		switch (number) {
		case 1:
			words = "One";
		case 2:
			words = "Two";
		case 3:
			words = "Three";
		case 4:
			words = "Four";
		case 5:
			words = "Five";
		case 6:
			words = "Six";
		case 7:
			words = "Seven";
		case 8:
			words = "Eight";
		case 9:
			words = "Nine";
		default:
			words = "???";
		}

		return words;
	}

	public void play(String setPlayerOne, String setPlayerTwo, int numberOfGames) {
		setPlayerOne = setPlayerOne.toUpperCase();
		setPlayerTwo = setPlayerTwo.toUpperCase();

		PlayerType player1 = new PlayerType();
		PlayerType player2 = new PlayerType();

		player1.setPlayer(setPlayerOne);
		player2.setPlayer(setPlayerTwo);

		int playerOneWins = 0;
		int playerTwoWins = 0;

		Player ticTacToePlayer = new Player();

		System.out.println("Field Looks like");

		Grid tac = new Grid();

		System.out.println("|7|8|9|");
		System.out.println("|4|5|6|");
		System.out.println("|1|2|3|");

		do {
			boolean sentinel = true;
			boolean circleWins = false;
			boolean crossWins = false;

			do {

				if (player1.getPlayer() == PlayerType.Player.USER) {
					tac = ticTacToePlayer.user(tac, TicTacToeSymbol.Symbol.CIRCLE);
					circleWins = tac.didCircleWin();
				} else if (player1.getPlayer() == PlayerType.Player.SMART) {
				//	tac = ticTacToePlayer.smart(tac, TicTacToeSymbol.Symbol.CIRCLE);
					circleWins = tac.didCircleWin();
				} else {
					tac = ticTacToePlayer.random(tac, TicTacToeSymbol.Symbol.CIRCLE);
					circleWins = tac.didCircleWin();
				}

				if (circleWins == false) {

					if (player2.getPlayer() == PlayerType.Player.USER) {
						tac = ticTacToePlayer.user(tac, TicTacToeSymbol.Symbol.CROSS);
						crossWins = tac.didCrossWin();
					} else if (player2.getPlayer() == PlayerType.Player.SMART) {
				//		tac = ticTacToePlayer.smart(tac, TicTacToeSymbol.Symbol.CROSS);
						crossWins = tac.didCrossWin();
					} else {
						tac = ticTacToePlayer.random(tac, TicTacToeSymbol.Symbol.CROSS);
						crossWins = tac.didCrossWin();
					}
				}
				
				if (circleWins == true) {
					playerOneWins++;
					sentinel = false;
				} else if (crossWins == true) {
					playerTwoWins++;
					sentinel = false;
				}

			} while (sentinel == true);
			numberOfGames--;
		} while (numberOfGames > 0);

		System.out.println("Player One Won: " + playerOneWins + " Games");
		System.out.println("Player two Won: " + playerTwoWins + " Games");

	}
}
