package Model;

import java.awt.*;
import java.util.ArrayList;

public class Pigeon implements Runnable {
    private Point pos;
    private boolean isAwake;
    private Integer speed;
    private Seed target;
    private Thread thread;
    private Point direction;

    public Pigeon(Point position) {
        pos = position;
        direction = new Point(0,0);
        thread = new Thread(this);
        thread.start();
        System.out.println("Init pigeon a la pos " + pos);
    }

    public void iterate(float elapsed, ArrayList<Seed> currentSeeds) {
        Seed targetSeed = findClosestSeed(currentSeeds);
        if (targetSeed != null) {
            setTarget(targetSeed);
        }

        //Check if closest seed is still target or if target is not set
        if (targetSeed != null) {
            // Check if seed is at eating distance
            // if so eat
            if (targetSeed.getPos().equals(pos) && !targetSeed.isBeingEaten()) {
                targetSeed.setBeingEaten(true);
                System.out.println("Miam");
            }
            // Otherwise move
            else {
                // Calculate seed direction
                direction.x = targetSeed.getPos().x - pos.x;
                direction.y = targetSeed.getPos().y - pos.y;

                // Calculate movement vector
                Point movement;
                double distance = calculateDistanceTo(targetSeed);
                int xMov = (int) (Math.round(direction.x / distance));
                int yMov = (int) (Math.round(direction.y / distance));
                movement = new Point(xMov, yMov);

                // Add movement to pos
                pos.x += movement.x;
                pos.y += movement.y;
            }

        }

        System.out.println(this.toSring());
    }

    private Seed findClosestSeed(ArrayList<Seed> currentSeeds) {
        if (currentSeeds.size() == 0) {
            System.out.println("No graines no pain");
            return null;
        }
        else {
            Seed closestSeed = null;
            double shortestDistance = 200000;
            for ( Seed seed : currentSeeds) {
                double distance = calculateDistanceTo(seed);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    closestSeed = seed;
                }
            }

            return closestSeed;
        }
    }

    private double calculateDistanceTo(Seed seed) {
        return Math.sqrt(Math.pow(seed.getPos().x - pos.x, 2) +  Math.pow(seed.getPos().y - pos.y, 2));
    }

    public String toSring() {
        return ("Pigeon a la position " + getPos());
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public Seed getTarget() {
        return target;
    }

    public void setTarget(Seed target) {
        this.target = target;
    }

    @Override
    public void run() {

    }
}
