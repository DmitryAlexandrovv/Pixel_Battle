package itis.model;


import itis.model.tanks.PixelTank;
import itis.model.tanks.Tank;

public class Player {
    protected Tank tank;

    public Player(){
        this.tank = new PixelTank(30, 30, 6, 6);
    }

    public Tank getTank(){
        return this.tank;
    }
}
