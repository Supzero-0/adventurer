package adventurer;

public class Position {
	private int x;
	private int y;
	
	// Constructeur avec paramètres pour commencer la partie à des coordonnées spécifiques
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getter pour la coordonnée x
	public int getX() {
		return x;
	}
	
	// Setter pour la coordonnée x
	public int setX(int x) {
		return this.x = x;
	}
	
	// Getter pour la coordonnée y
	public int getY() {
		return y;
	}
	
	// Setter pour la coordonnée y
	public int setY(int y) {
		return this.y = y;
	}
	
	// Méthode toString pour afficher les coordonnées de manière lisible
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
    // Méthode equals pour comparer deux objets Position
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }
}
