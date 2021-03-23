package Model;

import java.util.ArrayList;
import java.util.Vector;

public class Pigeon extends Thread {
    private Vector<Integer> pos;
    private boolean isAwake;
    private Integer speed;
    private Seed target;

    public void iterate(ArrayList<Seed> currentSeeds) {
        Seed targetSeed = findClosestSeed(currentSeeds);
        if (targetSeed != null) {
            setTarget(targetSeed);
        }

        //Check if closest seed is still target or if target is not set

        // Check if seed is at eating distance
        // if so eat

        // Otherwise move

            // Calculate seed direction

            // Calculate movement vector

            // Add movement to pos
    }

    private Seed findClosestSeed(ArrayList<Seed> currentSeeds) {
        if (currentSeeds.size() == 0) {
            return null;
        }
        else {
            Seed closestSeed = null;
            float shortestDistance = 200000;
            for ( Seed seed : currentSeeds) {
                float distance = calculateDistanceTo(seed);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    closestSeed = seed;
                }
            }

            return closestSeed;
        }
    }

    private float calculateDistanceTo(Seed seed) {
        return 200000;
    }

    public String toSring() {
        return ("Pigeon a la position " + getPos());
    }

    public Vector<Integer> getPos() {
        return pos;
    }

    public void setPos(Vector<Integer> pos) {
        this.pos = pos;
    }

    public Seed getTarget() {
        return target;
    }

    public void setTarget(Seed target) {
        this.target = target;
    }
}
