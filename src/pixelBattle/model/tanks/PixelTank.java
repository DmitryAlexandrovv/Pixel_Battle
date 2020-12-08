package pixelBattle.model.tanks;

import pixelBattle.Main;

public class PixelTank extends Tank{
    private static final String tankPath = Main.class.getResource("../resources/img/tank.png").toString();

    public PixelTank(int width, int height, int col, int row) {
        super(tankPath, width, height, col, row);
    }
}
