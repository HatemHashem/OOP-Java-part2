package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    private ArrayList<Figure>compoundFigures;

    public CompoundFigure() {
        super(0, 0);
        compoundFigures=new ArrayList<Figure>();
    }

    public void add(Figure f){
      this.compoundFigures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure currentFigure:compoundFigures){
            currentFigure.draw(graphics);
        }

    }

    @Override
    public void move(int dx, int dy) {
        for(Figure currentFigure:compoundFigures){
            currentFigure.move(dx,dy);
        }
    }
}
