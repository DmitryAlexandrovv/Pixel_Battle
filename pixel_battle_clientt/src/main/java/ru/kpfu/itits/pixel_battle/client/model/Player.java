package ru.kpfu.itits.pixel_battle.client.model;


import ru.kpfu.itits.pixel_battle.client.model.tanks.PixelTank;
import ru.kpfu.itits.pixel_battle.client.model.tanks.Tank;

public class Player {
    protected Tank tank;

    public Player(){
        this.tank = new PixelTank(30, 30, 6, 6);
    }

    public Tank getTank(){
        return this.tank;
    }
}
