package main;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.addPiece(new Piece(4), 0,1);
        g.addPiece(new Piece(2),1,1);
        g.addPiece(new Piece(2),2,1);
        g.addPiece(new Piece(2),1,3);
        System.out.println(g);
        g.movement("S");
        System.out.println(g);

    }
}
