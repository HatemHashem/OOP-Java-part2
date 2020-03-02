package wormgame.domain;

import wormgame.Direction;

import java.util.ArrayList;
import java.util.List;

public class Worm {
    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> worm;
    private boolean growOrNot;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        worm = new ArrayList<Piece>();
        worm.add(new Piece(originalX,originalY));
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
    }

    public Direction getDirection() {
        return originalDirection;

    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public int getLength() {
        //fix this
        return worm.size();
    }

    public List<Piece> getPieces() {
        return this.worm;
    }

    public void move() {

        if (originalDirection == Direction.UP) {
            this.originalY -= 1;
        } else if (originalDirection == Direction.DOWN) {
            this.originalY += 1;
        } else if (this.originalDirection == Direction.LEFT) {
            this.originalX -= 1;
        } else if (this.originalDirection == Direction.RIGHT) {
            this.originalX += 1;
        }

        if (this.getLength() < 3) {
            grow();

        }
        worm.add(new Piece(this.originalX,this.originalY));
        if(!growOrNot){
            this.worm.remove(0);
        }else {
            growOrNot=false;
        }

    }

    public void grow() {
        growOrNot=true;

    }
    public boolean runsInto(Piece piece){
        for(Piece wormPiece:worm){
           if( piece.runsInto(wormPiece)){
               return true;
           }
        }
        return false;
    }
   public boolean runsIntoItself(){
        int count=0;
      for(int i=0;i<worm.size();i++){
          for(int j=0;j<worm.size();j++){
              if(worm.get(i).runsInto(worm.get(j))){
                  count+=1;
              }
          }
          if(count>1){
              return true;
          }
          count=0;
      }

        return false;
   }

}
