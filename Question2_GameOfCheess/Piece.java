package Question2_GameOfCheess;

public class Piece {
    private String type;
    private String color;

    public Piece(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
