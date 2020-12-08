package pixelBattle.model;

import pixelBattle.model.tanks.PixelTank;
import pixelBattle.model.tanks.Tank;

public class Player {
    protected Tank tank;

    public Player(){
        this.tank = new PixelTank(40, 40, 6, 6);
    }

    public Tank getTank(){
        return this.tank;
    }
}
