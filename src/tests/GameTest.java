import main.Board;
import main.Game;
import main.Piece;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GameTest {

    @Test
    public void movementLeftWithoutCollisions(){
        Game game = new Game();
        game.addPiece(new Piece(2), 2,2);
        game.addPiece(new Piece(4), 2,4);
        game.movement("A");
        String actual = game.toString();
        String expected = "  0    0    0    0  \n" +
                          "  2    4    0    0  \n" +
                          "  0    0    0    0  \n" +
                          "  0    0    0    0  \n";
        assertEquals(expected, actual);
    }
}
