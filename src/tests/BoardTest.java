import org.junit.jupiter.api.Test;

import main.Piece;
import main.Board;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test
    public void addSeePiece(){
        Board b = new Board();
        b.addPiece(new Piece(4), 0,1);
        assertEquals(new Piece(4), b.seePiece(0,1));
    }

    @Test
    public void constructorTest(){
        Board b = new Board();
        assertEquals(new Piece(0), b.seePiece(2,1));
    }

    @Test
    public void toStringTest(){
        Board b = new Board();
        b.addPiece(new Piece(2), 0,1);
        b.addPiece(new Piece(4), 3, 3);
        b.addPiece(new Piece(16),2,1);
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
        b.addPiece(new Piece(2), 3,3);
        assertFalse(b.isColumnClear(3));
    }

    @Test
    public void clearCol2(){
        Board b = new Board();
        b.addPiece(new Piece(2), 3,3);
        assertTrue(b.isColumnClear(2));
    }

}
