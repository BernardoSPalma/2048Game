package main;

/**
 * Class representing the board of the game
 *
 * @author BernardoSPalma
 */
public class Board {

    private final Piece[][] board;
    private final static int BOARDSIZE = 4;

    /**
     * Constructor that initialize the board with the default size
     */
    public Board(){
        this.board = new Piece[BOARDSIZE][BOARDSIZE];
        for(int i = 0; i < BOARDSIZE; i++){
            for(int j = 0; j < BOARDSIZE; j++){
                this.board[i][j] = new Piece(0);
            }
        }
    }

    /**
     * Add one piece to a certain location on the board
     * @param p piece to be added
     * @param row row where the piece is going
     * @param col column where the piece is going
     */
    public void addPiece(Piece p, int row, int col){
        this.board[row - 1][col - 1] = p;
    }

    /**
     * See the piece value of a certain location
     * @param row row of the location
     * @param col column of the location
     * @return the piece value of the location
     */
    public int seePiece(int row, int col){
        return this.board[row][col].value();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for(Piece[] row : this.board){
            for(Piece p : row){
                output.append("  ").append(p.value()).append("  ");
            }
            output.append("\n");
        }
        return output.toString();
    }
}
