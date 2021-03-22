package Model;

import java.util.ArrayList;
import java.util.Vector;

public class Pigeon extends Thread{
    private Vector<Integer> pos;
    private boolean isAwake;
    private Integer speed;
    private Seed target;

    public void iterate(ArrayList<Seed> currentSeeds) {

    }

    private Seed findClosestSeed(ArrayList<Seed> currentSeeds) {
        return null;
    }

    public String toSring() {
        return ("Pigeon a la position " + pos);
    }
}
