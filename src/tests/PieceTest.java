import org.junit.jupiter.api.Test;

import main.Piece;

import static org.junit.jupiter.api.Assertions.*;

public class PieceTest {

    @Test
    public void equalsPiece(){
        Piece p = new Piece(4);
        assertEquals(new Piece(4), p);
    }

    @Test
    public void equalsPiece2(){
        Piece p = new Piece(0);
        assertEquals(new Piece(0), p);
    }

    @Test
    public void value(){
        Piece p = new Piece(2);
        assertEquals(2, p.value());
    }

    @Test
    public void value2(){
        Piece p = new Piece(0);
        assertEquals(0, p.value());
    }
}
