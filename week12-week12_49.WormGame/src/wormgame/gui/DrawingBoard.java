package wormgame.gui;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {
    WormGame wormGame;
    int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        super.setBackground(Color.WHITE);
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (Piece p : this.wormGame.getWorm().getPieces()) {
            g.fill3DRect(p.getX()*this.pieceLength, p.getY()*this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        g.setColor(Color.RED);
        Apple ap = this.wormGame.getApple();
        g.fillOval(ap.getX()*this.pieceLength, ap.getY()*this.pieceLength, this.pieceLength, this.pieceLength);
    }


    @Override
    public void update() {
        super.repaint();
    }
}
