package adventurer;

public class MovementData {
	private Position startPosition;
	private String movements;
	
	// Constructeur avec la position initiale et les mouvements
	public MovementData(Position startPosition, String movements) {
		this.startPosition = startPosition;
		this.movements = movements;
	}
	
	// Getter pour la position initiale
	public Position getStartPosition() {
		return startPosition;
	}
	
	// Getter pour les mouvements
	public String getMovements() {
		return movements;
	}
}
