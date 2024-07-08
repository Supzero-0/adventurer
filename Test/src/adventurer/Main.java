package adventurer;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			// Game game = new Game("./src/adventurer/carte.txt", "./src/adventurer/test1.txt");
			Game game = new Game("./src/adventurer/carte.txt", "./src/adventurer/test2.txt");
			// Game game = new Game("./src/adventurer/carte.txt", "./src/adventurer/test3.txt");
			Position finalPosition = game.getCharacterPosition();
			System.out.println("Le personnage se trouve en : " + finalPosition);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
