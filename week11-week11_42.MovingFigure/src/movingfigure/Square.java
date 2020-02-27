package movingfigure;

import java.awt.*;

public class Square extends Figure {
    private int sideLengt;

    public Square(int x, int y, int sideLengt) {
        super(x, y);
        this.sideLengt = sideLengt;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(),super.getY(),this.sideLengt,this.sideLengt);
    }
}
