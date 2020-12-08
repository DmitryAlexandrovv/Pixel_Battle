package pixelBattle.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import pixelBattle.Main;
import pixelBattle.exceptions.ClientException;
import pixelBattle.model.Player;
import pixelBattle.model.floors.Floor;
import pixelBattle.model.floors.StandartFloor;
import pixelBattle.model.tanks.Tank;
import pixelBattle.model.tanks.shots.Shot;
import pixelBattle.model.walls.StandartWall;
import pixelBattle.model.walls.UnbrokenWall;
import pixelBattle.model.walls.Wall;

public class MapController {
    @FXML
    public Button optionsMenuButton;

    @FXML
    private GridPane lawnGrid;

    @FXML
    private GridPane mapPage;

    @FXML
    private void options(MouseEvent event) throws ClientException {
        HeaderController.options(event);
    }

    public void initialize() throws Exception {
        Wall wall = new UnbrokenWall(40, 40, 0, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 1, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 2, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 3, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 4, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 5, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 6, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 7, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 8, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 9, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 10, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 11, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 12, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 14, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 15, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 16, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 17, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 1);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 2);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 3);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 4);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 5);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 6);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 7);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 8);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 9);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 1);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 2);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 3);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 4);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 5);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 6);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 7);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 8);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 9);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 1, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 2, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 3, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 4, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 5, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 6, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 7, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 8, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 9, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 10, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 11, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 12, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 10);
        wall.makeImage(lawnGrid);

        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 2, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 3, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 4, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 6, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 7, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 8, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 10, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 11, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 12, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 10, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 11, 3);
        wall.makeImage(lawnGrid);
        wall = new StandartWall(40, 40, 12, 3);
        wall.makeImage(lawnGrid);

        Floor floor = new StandartFloor(40, 40, 12, 4);
        floor.makeImage(lawnGrid);
        floor = new StandartFloor(40, 40, 11, 4);
        floor.makeImage(lawnGrid);

        Player player = new Player();
        Tank tank = player.getTank();
        tank.makeImage(lawnGrid);

        lawnGrid.sceneProperty().addListener((observableScene, oldScene, newScene) -> {
            if (oldScene == null && newScene != null) {
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.W){
                        tank.tankMoveForward();
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.S){
                        tank.tankMoveBack();
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.A){
                        tank.tankRotateLeft();
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.D){
                        tank.tankRotateRight();
                    }
                });
                newScene.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                    Shot shot = tank.tankFire();
                    shot.makeImage(lawnGrid);
                });
            }
        });
    }
}
