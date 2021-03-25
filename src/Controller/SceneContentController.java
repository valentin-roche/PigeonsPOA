package Controller;

import Model.SceneContent;

import java.awt.*;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class SceneContentController {
    private SceneContent sceneContent;
    private int nbPigeons;
    private int maxNbSeeds;
    private int nbSeeds;

    public SceneContentController(SceneContent sceneContent, int nbPigeons, int nbSeeds, int maxNbSeeds) {
        this.sceneContent = sceneContent;
        this.nbPigeons = nbPigeons;
        this.maxNbSeeds = maxNbSeeds;

        for (int nbP = 0; nbP < nbPigeons; nbP++ )
            this.sceneContent.addPigeon(new Point(ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1)));

        for (int nbS = 0; nbS < nbSeeds; nbS++)
            this.addSeed(new Point(ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1)));

    }

    public void addSeed(Point atPos) {
        if (nbSeeds < maxNbSeeds) {
            sceneContent.addSeed(atPos);
        }
    }
}
