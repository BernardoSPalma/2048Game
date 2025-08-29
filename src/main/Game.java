package main;

public class Game {

    private final Board boardGame;

    public Game(){
        this.boardGame = new Board();
    }

    public void movement(String key){
        switch(key){
            case "A":
                movementLeft();
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

    private void movementLeft(){
        //verificar as linhas que nao estao vazias
        for(int row = 0; row < this.boardGame.size(); row++){
            if(!boardGame.isRowClear(row)){
                //Logica do movimento
                for(int col = 1; col < this.boardGame.size(); col++){
                    if(this.boardGame.seePiece(row,col).value() != 0){
                        int colWithPiece = col;
                        while(colWithPiece - 1 >= 0 && this.boardGame.seePiece(row, colWithPiece - 1).value() == 0){
                            this.boardGame.movePiece(row, colWithPiece, row,colWithPiece - 1);
                            colWithPiece --;
                        }
                    }
                }
                //Logica das fusoes
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
