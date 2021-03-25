package Model;

import java.awt.*;

public class Seed {
    private Point pos;
    private boolean isBeingEaten;

    public Seed(Point position) {
        setPos(position);
        setBeingEaten(false);
        System.out.println("Init graines a la pos " + pos);
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public boolean isBeingEaten() {
        return isBeingEaten;
    }

    public void setBeingEaten(boolean beingEaten) {
        isBeingEaten = beingEaten;
    }
}
