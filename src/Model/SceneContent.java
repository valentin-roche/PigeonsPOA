package Model;

import java.lang.reflect.Array;
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

    public void iterate() {

    }

    public void addPigeon(Vector<Integer> position) {

    }

    public void addSeed(Vector<Integer> position) {

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
