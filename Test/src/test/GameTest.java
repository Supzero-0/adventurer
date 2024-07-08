package test;

import org.junit.Test;

import adventurer.Game;
import adventurer.Position;

import java.io.IOException;
import static org.junit.Assert.*;

public class GameTest {
	
	@Test
	public void testGame() throws IOException {
		Game game = new Game("./src/test/carte_test.txt", "./src/test/mouvement_test.txt");
		Position finalPosition = game.getCharacterPosition();
		
		Position expectedPosition = new Position(6,16);
		assertEquals(expectedPosition, finalPosition);
	}

}
