package Controller;

import Model.SceneContent;
import View.Scene;

import java.util.Timer;

public class ApplicationController {
    private long updateInterval = 500; // Refresh rate in ms
    private SceneContent content;
    private SceneContentController contentController;
    private Scene scene;

    public ApplicationController () {
        content = new SceneContent();
        contentController = new SceneContentController(content, 1, 1, 10);
        scene = new Scene();

        run();
    }

    public void run() {
        long lastUpdate = System.currentTimeMillis();
        while(true) {
            long elapsed = System.currentTimeMillis() - lastUpdate;
            if (elapsed >= updateInterval) {
                System.out.println("update : " + elapsed);
                float elapsedAsSeconds = elapsed / 1000f;
                content.iterate(elapsedAsSeconds);
                lastUpdate = System.currentTimeMillis();
            }
        }
    }

}
