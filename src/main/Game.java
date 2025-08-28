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
        for(int i = 1; i <= this.boardGame.size(); i++){
            if(!boardGame.isRowClear(i)){
                //Logica do movimento
                for(int j = 2; j <= boardGame.size(); i++){
                    int squareNum = j;
                    while(squareNum - 1 > 0 && this.boardGame.seePiece(i,squareNum - 1).value() == 0){
                        this.boardGame.movePiece(i,squareNum,i,squareNum - 1);
                        squareNum--;
                    }
                }
                //logica das somas
            }
        }
    }

    private void movementDown(){

    }

    private void movementRight(){

    }

    private void movementUp(){

    }

}
