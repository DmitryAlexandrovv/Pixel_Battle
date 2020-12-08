package pixelBattle.model.floors;

import pixelBattle.Main;

public class StandartFloor extends Floor {
    private static final String floorPath = Main.class.getResource("../resources/img/standartFloor.png").toString();

    public StandartFloor(int width, int height, int col, int row) {
        super(floorPath, width, height, col, row);
    }
}
