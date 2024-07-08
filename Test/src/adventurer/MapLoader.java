package adventurer;

import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MapLoader {
	/**
	 * Charge la carte à partir d'un fichier texte
	 * 
	 * @param filePath Le chemin du fichier contenant la carte
	 * @return Un tableau 2D représentant la carte
	 * @throws IOException Si une erreur survient lors de la lecture du fichier
	 */
	public char[][] loadMap(String filePath) throws IOException {
		// Lis les lignes du fichier pour le mettre dans une liste de chaines de caractères
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		
		// Détermine le nombre de lignes et de colonnes de la carte
		int rows = lines.size();
		int cols = lines.get(0).length();
		
		// Initialise le tableau 2D
		char[][] map = new char[rows][cols];
		
		// Parcours chaque ligne du fichier
		for (int i = 0; i < rows; i++) {
			// Convertis chaque ligne en tableau de caractères et l'ajoute au tableau 2D
			map[i] = lines.get(i).toCharArray();
		}
		
		// Retourne le tableau 2D
		return map;
	}
}
