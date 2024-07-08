package adventurer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MovementLoader {
	
	/**
	 * Charge les données de déplacement à partir d'un fichier texte
	 * 
	 * @param filePath Le chemin du fichier
	 * @return Un objet Movement Data contenant la position initiale et les mouvements
	 * @throws IOException Si une erreur survient lors de la lecture du fichier
	 */
	public MovementData loadMovement(String filePath) throws IOException {
		//Lis les lignes du fichier pour le mettre dans une liste de chaines de caractères
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		
		// Extrait la position initiale à partir de la première ligne
		String[] startCoordinates = lines.get(0).split(",");
		Position startPosition = new Position(
				Integer.parseInt(startCoordinates[0]),
				Integer.parseInt(startCoordinates[1])
				);
		
		// Extrait les mouvements à partir de la deuxième ligne
		String movements = lines.get(1);
		
		// Retourne un objet Movement Data contenant la position initiale et les mouvements
		return new MovementData(startPosition, movements);
	}
}
