package itis.model.tanks.shots;

import itis.Main;
import itis.model.tanks.Tank;

public class PixelTankShot extends Shot {
    private static final String SHOT_PATH = Main.class.getResource("../resources/img/shot2.png").toString();

    public PixelTankShot(int width, int height, Tank tank) {

        super(SHOT_PATH, width, height, tank);
    }
}
