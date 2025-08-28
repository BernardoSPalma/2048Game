import org.junit.jupiter.api.Test;

import main.Piece;
import main.Board;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test
    public void addSeePiece(){
        Board b = new Board();
        b.addPiece(new Piece(4), 1,2);
        assertEquals(new Piece(4), b.seePiece(1,2));
    }

    @Test
    public void constructorTest(){
        Board b = new Board();
        assertEquals(new Piece(0), b.seePiece(3,2));
    }

    @Test
    public void toStringTest(){
        Board b = new Board();
        b.addPiece(new Piece(2), 1,2);
        b.addPiece(new Piece(4), 4, 4);
        b.addPiece(new Piece(16),3,2);
        String expected = "  0    2    0    0  \n  0    0    0    0  \n  0    16    0    0  \n  0    0    0    4  \n";
        assertEquals(expected, b.toString());
    }

    @Test
    public void clearRow(){
        Board b = new Board();
        b.addPiece(new Piece(2), 2,2);
        assertFalse(b.isRowClear(2));
    }

    @Test
    public void clearRow2(){
        Board b = new Board();
        b.addPiece(new Piece(4), 2,3);
        assertTrue(b.isRowClear(1));
    }

    @Test
    public void clearCol(){
        Board b = new Board();
        b.addPiece(new Piece(2), 3,4);
        assertFalse(b.isColumnClear(4));
    }

    @Test
    public void clearCol2(){
        Board b = new Board();
        b.addPiece(new Piece(2), 3,4);
        assertTrue(b.isColumnClear(2));
    }

}
