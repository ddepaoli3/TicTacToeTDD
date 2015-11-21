import java.util.List;
import java.util.Arrays;


public class TicTacToe {
	
	String player;
	String[] table;

	public TicTacToe(){
		this.player = "x";
		table = new String[9];
		Arrays.fill(table, " ");
	}
	
	Boolean isEmpty(){
		for (int i=0; i<9; i++)
		{
			if (this.table[i] == "x" || this.table[i] == "o" )
				return false;
		}
		
		return true;
	}
	
	public Boolean play(int number)
	{
		if (this.table[number] == " ")
		{
			this.table[number] = this.player;
			this.player = (this.player == "x") ? "o":"x";
			return true;
		}
		
		return false;
	}
	
	public String winner()
	{
		//Vertical case
		if (this.table[6] == this.table[3] && 
			this.table[3] == this.table[0] &&
			this.table[6] != " ")
				return this.table[6];
		if (this.table[7] == this.table[4] && 
			this.table[4] == this.table[1] &&
			this.table[7] != " ")
				return this.table[7];
		if (this.table[8] == this.table[5] && 
			this.table[5] == this.table[2] &&
			this.table[8] != " ")
				return this.table[8];
		
		//Orizonatal case
		if (this.table[6] == this.table[7] && 
			this.table[7] == this.table[8] &&
			this.table[6] != " ")
				return this.table[6];
		if (this.table[3] == this.table[4] && 
			this.table[4] == this.table[5] &&
			this.table[3] != " ")
				return this.table[3];
		if (this.table[0] == this.table[1] && 
			this.table[1] == this.table[2] &&
			this.table[0] != " ")
				return this.table[0];
		
		//Diagonal case
		if (this.table[6] == this.table[4] && 
			this.table[4] == this.table[2] &&
			this.table[6] != " ")
				return this.table[6];
		if (this.table[0] == this.table[4] && 
			this.table[4] == this.table[8] &&
			this.table[0] != " ")
				return this.table[0];
		
		return "none";
	}
	
	public Boolean isDraw()
	{

		for (int i=0; i<9; i++)
		{
			if (this.table[i] == " ")
				return false;
		}
		
		return true;
		

	}
	
	public void printTable()
	{
		System.out.printf("%s|%s|%s\n", this.table[6], this.table[7], this.table[8]);
		System.out.printf("-+-+-\n" );
		System.out.printf("%s|%s|%s\n", this.table[3], this.table[4], this.table[5]);
		System.out.printf("-+-+-\n" );
		System.out.printf("%s|%s|%s\n", this.table[0], this.table[1], this.table[2]);
	}

}
