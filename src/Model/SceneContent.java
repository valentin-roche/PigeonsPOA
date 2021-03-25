package Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class SceneContent {
    private ArrayList<Pigeon> pigeons;
    private ArrayList<Seed> seeds;

    public SceneContent(ArrayList<Pigeon> pigeonsParam, ArrayList<Seed> seedsParam) {
        setPigeons(pigeonsParam);
        setSeeds(seedsParam);
    }

    public SceneContent() {
        pigeons = new ArrayList<>();
        seeds = new ArrayList<>();
    }

    public void iterate(float elapsed) {
        for (Pigeon pigeon : pigeons) {
            pigeon.iterate(elapsed, seeds);
        }

        seeds.removeIf(Seed::isBeingEaten);
    }

    public void addPigeon(Point position) {
        pigeons.add(new Pigeon(position));
    }

    public void addSeed(Point position) {
        seeds.add(new Seed(position));
    }

    public ArrayList<Pigeon> getPigeons() {
        return pigeons;
    }

    public void setPigeons(ArrayList<Pigeon> pigeons) {
        this.pigeons = pigeons;
    }

    public ArrayList<Seed> getSeeds() {
        return seeds;
    }

    public void setSeeds(ArrayList<Seed> seeds) {
        this.seeds = seeds;
    }
}
