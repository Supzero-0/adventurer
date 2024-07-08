package adventurer;

import java.io.IOException;

public class Game {
	private char[][] map;
	private Character character;
	
	/**
	 * Initialisation de la carte et du personnage en chargeant les fichiers correspondants
	 * 
	 * @param mapFilePath Le chemin du fichier contenant la carte
	 * @param movementFilePath Le chemin du fichier contenant les mouvements
	 * @throws IOException Si une erreur survient lors de la lecture des fichiers
	 */
	public Game(String mapFilePath, String movementFilePath) throws IOException {
		// Charge la carte à partir du fichier
		MapLoader mapLoader = new MapLoader();
		this.map = mapLoader.loadMap(mapFilePath);
		
		// Charge les mouvements à partir du fichier
		MovementLoader movementLoader = new MovementLoader();
		MovementData movementData = movementLoader.loadMovement(movementFilePath);
		
		// Crée le personnage à la position initiale
		this.character = new Character(movementData.getStartPosition());
		
		// Exécute les mouvements du personnage
		executeMovements(movementData.getMovements());
	}
	
	/**
	 * Exécute les mouvements du personnage
	 * 
	 * @param movements Chaine de caractères représentant les directions des mouvements
	 */
	private void executeMovements(String movements) {
		// Affichage de la map avec le personnage
		displayMap();
		// Parcours chaque caractère des mouvements
		for (char move : movements.toCharArray()) {
			// Déplace le personnage dans la direction spécifiée
			character.move(move, map);
			// Affichage de la map après le mouvement
			displayMap();
		}
	}
	
	// Getter de la position actuelle du personnage
	public Position getCharacterPosition() {
		return character.getPosition();
	}
	
	// Fonction permettant d'afficher la map avec le personnage dans la console
	private void displayMap() {
		// Crée une copie de la carte pour affichage
		char[][] displayMap = new char[map.length][];
		
		// Copie chaque ligne de la carte originale dans la carte d'affichage
		for (int i = 0; i < map.length; i++) {
			// Utilise la méthode clone() pour copier le tableau de caractères
			displayMap[i] = map[i].clone();
		}
		
		// Obtiens la position actuelle du personnage
		Position position = character.getPosition();
		int x = position.getX();
		int y = position.getY();
		
		// Marque la position du personnage avec 'P'
		displayMap[y][x] = 'P';
		
		// Affiche chaque ligne de la carte
		for (char[] row : displayMap) {
			// Convertis le tableau en chaine de caractères et l'affiche
			System.out.println(new String(row));
		}
		// Ajout d'une ligne vide pour plus de lisibilité dans la console
		System.out.println();
	}
}
