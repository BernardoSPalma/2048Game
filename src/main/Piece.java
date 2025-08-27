package main;

/**
 * Class representing a piece of the game
 *
 * @author BernardoSPalma
 */
public class Piece {
    private int value;

    /**
     * Constructor of the piece
     * @param value initial value for the piece
     */
    public Piece(int value){
        this.value = value;
    }

    /**
     * Change the value of the piece
     * @param value new piece value
     */
    public void setValue(int value){
        this.value = value;
    }

    /**
     * The piece value
     * @return an int representing the piece value
     */
    public int value(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Piece piece = (Piece) o;
        return value == piece.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Piece with value: " + this.value;
    }
}
