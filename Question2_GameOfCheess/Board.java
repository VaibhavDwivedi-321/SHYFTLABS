package Question2_GameOfCheess;

public class Board {
    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        // Initialize squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int x, int y) {
        return squares[x][y];
    }
}
