package wormgame.domain;

public class Piece {
    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean runsInto(Piece piece){
        if(this.getX()==piece.getX()&&this.getY()==piece.getY()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
