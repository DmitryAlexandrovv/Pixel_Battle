package ru.kpfu.itits.pixel_battle.client.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import ru.kpfu.itis.pixel_battle.protocol.UserAction;
import ru.kpfu.itits.pixel_battle.client.model.GameElements;
import ru.kpfu.itits.pixel_battle.client.model.Position;
import ru.kpfu.itits.pixel_battle.client.model.floors.Floor;
import ru.kpfu.itits.pixel_battle.client.exceptions.ClientException;
import ru.kpfu.itits.pixel_battle.client.model.User;
import ru.kpfu.itits.pixel_battle.client.model.floors.StandartFloor;
import ru.kpfu.itits.pixel_battle.client.model.tanks.PixelTank;
import ru.kpfu.itits.pixel_battle.client.model.tanks.Tank;
import ru.kpfu.itits.pixel_battle.client.model.tanks.shots.EnemyTank;
import ru.kpfu.itits.pixel_battle.client.model.tanks.shots.Shot;
import ru.kpfu.itits.pixel_battle.client.model.walls.StandartWall;
import ru.kpfu.itits.pixel_battle.client.model.walls.UnbrokenWall;
import ru.kpfu.itits.pixel_battle.client.model.walls.Wall;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.*;

public class MapController {
    private volatile User user;
    private volatile User enemy;
    private HashMap<Position, GameElements> gameElements;

    @FXML
    public Button optionsMenuButton;

    @FXML
    private GridPane lawnGrid;

    @FXML
    private void options(MouseEvent event) throws ClientException {
        HeaderController controller = new HeaderController();
        controller.setUser(user);
        controller.options(event);
    }

    private Tank getTank(){
        return user.getTank();
    }

    public void initialize() throws Exception {
        gameElements = new HashMap<>();

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
        wall = new UnbrokenWall(40, 40, 18, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 19, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 20, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 21, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 22, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 23, 0);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 0);
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
        wall = new UnbrokenWall(40, 40, 0, 11);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 12);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 13);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 14);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 15);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 16);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 17);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 0, 18);
        wall.makeImage(lawnGrid);

        wall = new UnbrokenWall(40, 40, 24, 1);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 2);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 3);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 4);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 5);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 6);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 7);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 8);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 9);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 10);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 11);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 12);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 13);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 14);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 15);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 16);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 17);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 18);
        wall.makeImage(lawnGrid);

        wall = new UnbrokenWall(40, 40, 0, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 1, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 2, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 3, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 4, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 5, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 6, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 7, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 8, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 9, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 10, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 11, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 12, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 13, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 14, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 15, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 16, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 17, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 18, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 19, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 20, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 21, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 22, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 23, 18);
        wall.makeImage(lawnGrid);
        wall = new UnbrokenWall(40, 40, 24, 18);
        wall.makeImage(lawnGrid);

        wall = new StandartWall(40, 40, 2, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 3, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 4, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 6, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 7, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 8, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 10, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 11, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);
        wall = new StandartWall(40, 40, 12, 3);
        wall.makeImage(lawnGrid);
        gameElements.put(wall.getPosition(), wall);

        Floor floor = new StandartFloor(40, 40, 12, 4);
        floor.makeImage(lawnGrid);
        floor = new StandartFloor(40, 40, 11, 4);
        floor.makeImage(lawnGrid);
    }

    public void drawUser(){
        user.setTank(new PixelTank(30, 30, 6, 6));
        Tank tank = user.getTank();
        tank.makeImage(lawnGrid);
    }

    public void initUserActions(){
        lawnGrid.sceneProperty().addListener((observableScene, oldScene, newScene) -> {
            Tank tank = user.getTank();
            if (oldScene == null && newScene != null) {
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.W){
                        Position position = new Position(user.getTank().getPosition());
                        position.setX(user.getTank().getChangeX());
                        position.setY(user.getTank().getChangeY());

                        Boolean element = getElemtnByPosition(position);

                        if(element){

                        } else {
                            user.setAction(UserAction.TANK_MOVE_FORWARD);
                            tank.tankMoveForward();
                        }
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.S){
                        Boolean element = getElemtnByPosition(user.getTank().getPosition());
                        if(element){

                        } else {
                            user.setAction(UserAction.TANK_MOVE_BACK);
                            tank.tankMoveBack();
                        }
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.A){
                        user.setAction(UserAction.TANK_ROTATE_LEFT);
                        double deg = tank.getRotate();
                        tank.tankRotateLeft();
                    }
                });
                newScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
                    if(event.getCode() == KeyCode.D){
                        user.setAction(UserAction.TANK_ROTATE_RIGHT);
                        tank.tankRotateRight();
                    }
                });
                newScene.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                    user.setAction(UserAction.TANK_SHOT);
                    Shot shot = tank.tankFire();
                    shot.makeImage(lawnGrid);
                });
                newScene.addEventHandler(KeyEvent.KEY_RELEASED, event -> {
                    user.setAction(UserAction.STATE);
                });
            }
        });
    }

    public void drawEnemy(){
        enemy.setTank(new EnemyTank(30, 30, 6, 1));
        Tank tank = enemy.getTank();
        tank.makeImage(lawnGrid);
        tank.tankRotateRight(180);
    }

    public void initEnemyActions(){
        Thread enemyThread = new Thread(() -> {
            while(true){
                if(enemy.getFlag()){
                    UserAction action = enemy.getAction();
                    switch (action){
                        case TANK_MOVE_FORWARD:
                            Boolean element = getElemtnByPosition(enemy.getTank().getPosition());
                            if(element){
                                System.out.println(1 + "!!!!!!!!!!!");
                                break;
                            }
                            enemy.getTank().tankMoveForward();
                            break;
                        case TANK_MOVE_BACK:
                            enemy.getTank().tankMoveBack();
                            break;
                        case TANK_ROTATE_LEFT:
                            enemy.getTank().tankRotateLeft();
                            break;
                        case TANK_ROTATE_RIGHT:
                            enemy.getTank().tankRotateRight();
                            break;
                        case TANK_SHOT:
                            Shot shot = enemy.getTank().tankFire();
                            Platform.runLater(() -> {
                                shot.makeImage(lawnGrid);
                            });
                            break;
                        case STATE:
                            System.out.println("I am wait");
                            break;
                    }
                }
            }
        });

        enemyThread.start();
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setEnemy(User enemy){
        this.enemy = enemy;
    }

    public Boolean getElemtnByPosition(Position position){
        Set<Position> set  = gameElements.keySet();
        Iterator<Position> iterator = set.iterator();
        while(iterator.hasNext()){
            Position elemPosition = iterator.next();
            if(elemPosition.equals(position)){
                System.out.println("Finding");
                return true;
            }
        }
        return false;
    }
}
