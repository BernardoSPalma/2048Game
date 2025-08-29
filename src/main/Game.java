package main;

public class Game {

    private final Board boardGame;

    public Game(){
        this.boardGame = new Board();
    }

    public void movement(String key){
        switch(key){
            case "A":
                Left();
                break;
            case "S":
                movementDown();
                break;
            case "D":
                movementRight();
                break;
            case "W":
                movementUp();
                break;
        }
    }

    public void addPiece(Piece p, int row, int col){
        this.boardGame.addPiece(p,row,col);
    }

    private void Left(){
        //verificar as linhas que nao estao vazias
        for(int row = 0; row < this.boardGame.size(); row++){
            if(!boardGame.isRowClear(row)){
                //Logica do movimento
                movementLeft(row);
                //Logica das fusoes
                collisionLeft(row);
                movementLeft(row);
            }
        }
    }

    private void movementLeft(int row){
        for(int col = 1; col < this.boardGame.size(); col++){
            if(this.boardGame.seePiece(row,col).value() != 0){
                int colWithPiece = col;
                while(colWithPiece - 1 >= 0 && this.boardGame.seePiece(row, colWithPiece - 1).value() == 0){
                    this.boardGame.movePiece(row, colWithPiece, row,colWithPiece - 1);
                    colWithPiece --;
                }
            }
        }
    }

    private void collisionLeft(int row){
        for(int col = 0; col < this.boardGame.size(); col++){
            if(this.boardGame.seePiece(row,col).value() != 0 && this.boardGame.seePiece(row,col).value() == this.boardGame.seePiece(row, col + 1).value()){
                this.boardGame.addPiece(new Piece(this.boardGame.seePiece(row, col + 1).value() * 2), row, col);
                this.boardGame.removePiece(row,col + 1);
            }
        }
    }

    private void movementDown(){

    }

    private void movementRight(){

    }

    private void movementUp(){

    }

    @Override public String toString() {
        return this.boardGame.toString();
    }
}
