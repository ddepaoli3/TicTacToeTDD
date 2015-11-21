import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.*;


public class TicTacToeTest {
	TicTacToe testGame;
	
//	Scenario 1
	
    @Before
    public void setUp() {
        testGame = new TicTacToe();
    }
	
	@Test
	public void testBoardEmpty() {
		assertTrue(testGame.isEmpty());
	}
	
	@Test
	public void testFirstPlayer(){
		assertEquals("x", testGame.player);
	}
	
//	Scenario 2
	
	@Test
	public void testPlay1()
	{
		testGame.play(6);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(4);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(3);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(2);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(0);
		assertEquals("x", testGame.winner());
	}
	
//	Scenario 3
	@Test
	public void testPlay2()
	{
		testGame.play(6);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(3);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(0);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(4);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(8);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(5);
		assertEquals("o", testGame.winner());
	}
//	Scenario 4
	@Test
	public void testPlay3()
	{
		testGame.play(6);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(3);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(4);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(0);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		testGame.play(2);
		assertEquals("x", testGame.winner());
	}

//	Scenario 5
	@Test
	public void testPlay4()
	{
		testGame.play(0);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(2);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(1);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(3);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(5);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(4);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(6);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(7);
		assertEquals("x", testGame.player);
		assertEquals("none", testGame.winner());
		assertFalse(testGame.isDraw());
		testGame.play(8);
		assertEquals("o", testGame.player);
		assertEquals("none", testGame.winner());
		assertTrue(testGame.isDraw());
	}
}
