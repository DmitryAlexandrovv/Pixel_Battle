package ru.kpfu.itits.pixel_battle.client.model.tanks.shots;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import ru.kpfu.itits.pixel_battle.client.model.GameElements;
import ru.kpfu.itits.pixel_battle.client.model.Position;
import ru.kpfu.itits.pixel_battle.client.model.tanks.Tank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class Shot extends GameElements {
    protected int col;
    protected int row;
    protected Timeline shotAnimation;
    protected Tank tank;
    protected double rotate;
    protected Position position;

    public Shot(String path, int col, int row, int width, int height, Tank tank) {
        super(path, width, height, col, row);
        this.col = col;
        this.row = row;
        this.tank = tank;
        this.rotate = tank.getRotate();
    }

    public void makeImage(GridPane lawn, HashMap<Position, GameElements> gameElements){
        img = new ImageView();
        Image im = new Image(path, width, height,false,false);
        img.setImage(im);
        img.setTranslateX(tank.getX());
        img.setTranslateY(tank.getY());
        img.setRotate(tank.getRotate());
        position = new Position(col, row, col * 50 + 20, row * 50 - 20);
        lawn.add(img, 0, 0);
        shotFlight(gameElements);
    }

    private void shotFlight(HashMap<Position, GameElements> gameElements){
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), e -> {
            Boolean element = getElemtnByPosition(position, gameElements);
            System.out.println(position.getCol() + "SHOT Col");
            if(element){
                this.shotAnimation.stop();
            }
            shotWalk();
        }));
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
        this.shotAnimation = animation;
    }

    private void shotWalk(){
        double changeX = Math.sin(Math.toRadians(rotate)) * tank.getShotSpeed();
        double changeY = Math.cos(Math.toRadians(rotate)) * tank.getShotSpeed();

        img.setTranslateX(img.getTranslateX() + changeX);
        img.setTranslateY(img.getTranslateY() - changeY);

        position.setX(changeX * (-1));
        position.setY(changeY * (-1));
    }

    public Boolean getElemtnByPosition(Position position, HashMap<Position, GameElements> gameElements){
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
