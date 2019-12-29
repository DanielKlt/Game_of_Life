package game;

import static java.lang.Thread.sleep;

public class GameClock {

    public boolean running = true;

    public void run(){

        while (running){
            try {
                sleep(50);
                GM.nextGeneration();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
