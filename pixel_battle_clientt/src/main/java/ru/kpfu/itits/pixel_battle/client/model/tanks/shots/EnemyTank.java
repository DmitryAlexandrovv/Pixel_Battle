package ru.kpfu.itits.pixel_battle.client.model.tanks.shots;

import ru.kpfu.itits.pixel_battle.client.Main;
import ru.kpfu.itits.pixel_battle.client.model.tanks.Tank;

public class EnemyTank extends Tank {
    private static final String TANK_PATH = Main.class.getResource("/img/pixeltank1.png").toString();
    private static final double DAMAGE = 5;
    private static final int HP = 50;
    private static final double SHOT_SPEED = 5;
    private static final double SPEED = 2;

    public EnemyTank(int width, int height, int col, int row)
    {
        super(TANK_PATH, width, height, col, row, DAMAGE, HP, SHOT_SPEED, SPEED);
    }
}
