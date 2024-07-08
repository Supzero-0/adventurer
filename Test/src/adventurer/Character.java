package adventurer;

public class Character {
	private Position position;
	
	// Constructeur pour donner la position spécifique du personnage
	public Character(Position startPosition) {
		this.position = startPosition;
	}
	
	// Getter pour la position actuelle du personnage
	public Position getPosition() {
		return position;
	}
	
	/**
	 * Déplace le personnage si le déplacement est valide
	 * 
	 * @param direction Déplacement du personnage suivant la direction 'N', 'S', 'E', 'O'
	 * @param map Carte représentée par un tableau 2D
	 */
	public void move(char direction, char[][] map) {
		// Coordonnées actuelles
		int newX = position.getX();
		int newY = position.getY();
		
		// Modifie les coordonnées en fonction de la direction
		switch (direction) {
			case 'N': newY -= 1; break;
			case 'S': newY += 1; break;
			case 'E': newX += 1; break;
			case 'O': newX -= 1; break;
		}
		
		// Vérifie si le déplacement est valide
		if (isValidMove(newX, newY, map)) {
			// Mets à jour si le déplacement est valide
			position.setX(newX);
			position.setY(newY);
			System.out.println("Déplacement réussi à : " + newX +","+ newY);
			// Ajout d'une ligne vide pour plus de lisibilité dans la console
			System.out.println();
		} else {
			System.out.println("Le personnage ne peut pas passer les bois impénétrables à : " + newX +","+ newY);
		}
	}
	
	/**
	 * Vérifie si le déplacement vers une nouvelle position est valide
	 * 
	 * @param x Nouvelle coordonnée x
	 * @param y Nouvelle coordonnée y
	 * @param map Carte représentée par un tableau 2D
	 * @return True si le déplacement est valide, false sinon
	 */
	private boolean isValidMove(int x, int y, char[][] map) {
		// Vérifie que les nouvelles coordonnées sont dans les limites de la carte
		if (x >= 0 && y >= 0 && x < map.length && y < map[0].length) {
			// Vérifie que la case n'est pas un bois impénétrables
			return map[y][x] == ' ';
		}
		System.out.println("Le personnage doit rester dans la limite du terrain");
		return false;
	}
}
