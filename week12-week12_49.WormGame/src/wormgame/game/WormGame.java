package wormgame.game;

import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        this.worm = new Worm(this.width / 2, this.height / 2, Direction.DOWN);
        while (true) {

            int appleX = new Random().nextInt(this.width - 0) + 0;
            int appleY = new Random().nextInt(this.height - 0) + 0;
            if (!worm.runsInto(new Apple(appleX,appleY))){
                apple = new Apple(appleX, appleY);
                break;

            }
        }


    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.worm.move();
        if (worm.runsInto(this.apple)) {
            worm.grow();
            while (true) {

                int appleX = new Random().nextInt(this.width - 0) + 0;
                int appleY = new Random().nextInt(this.height - 0) + 0;
                if (!worm.runsInto(new Apple(appleX, appleY))) {
                    apple = new Apple(appleX, appleY);
                    break;

                }
            }
        }
        if(worm.runsIntoItself()){
            continues=false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());
        for(Piece wormPiece:this.worm.getPieces()){
            if(wormPiece.getX()==0||wormPiece.getX()>=this.width||
                    wormPiece.getY()==0||wormPiece.getY()>=this.height){
                continues=false;
            }
        }

    }

    public Worm getWorm() {
        return this.worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
