
public class demo {
	
	protected demo(){}
	
	public static void main(String [] args)
	{
		System.out.println("Game Board Creation");
		TicTacToe game = new TicTacToe();
		String winner = game.winner();
		Boolean isDraw = game.isDraw();
		while ( winner == "none")
		{
			if (game.play(0 + (int)(Math.random()*9) ))
			{
				winner = game.winner();
				game.printTable();
				System.out.println();
				if (winner != "none")
					break;
				if (game.isDraw())
					break;
				try {
				    Thread.sleep(2000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				} 
			}
		}
		if (game.isDraw() && winner == "none")
			System.out.printf("Game ends with a draw! \n");
		else
			System.out.printf("Player '%s' won!\n", winner);
		
		return;
	}

}
