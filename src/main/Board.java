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
        this.board[row][col] = p;
    }

    /**
     * Remove one piece on the board
     * @param row row where the piece is
     * @param col column where the piece is
     */
    public void removePiece(int row, int col){
        this.board[row][col] = new Piece(0);
    }

    /**
     * Moves a piece to a diferent Location, if there is one piece in the final location that piece is removed
     * @param initRow row of the piece to change
     * @param initCol col of the piece to change
     * @param finalRow row of the final position
     * @param finalCol col of the final position
     */
    public void movePiece(int initRow, int initCol, int finalRow, int finalCol){
        this.board[finalRow][finalCol] = this.board[initRow][initCol];
        this.board[initRow][initCol] = new Piece(0);
    }

    /**
     * See the piece value of a certain location
     * @param row row of the location
     * @param col column of the location
     * @return the piece value of the location
     */
    public Piece seePiece(int row, int col){
        return this.board[row][col];
    }

    public int size(){
        return this.BOARDSIZE;
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

    public boolean isRowClear(int rowNumber){
        for(int i = 0; i < board.length; i++){
            if(this.board[rowNumber][i].value() != 0){
                return false;
            }
        }
        return true;
    }

    public boolean isColumnClear(int colNumber){
        for(int i = 0; i < this.board.length; i++){
            if(this.board[i][colNumber].value() != 0){
                return false;
            }
        }
        return true;
    }
}
