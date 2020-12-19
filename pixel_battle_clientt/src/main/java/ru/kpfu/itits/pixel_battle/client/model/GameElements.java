package ru.kpfu.itits.pixel_battle.client.model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.Serializable;

public abstract class GameElements implements Serializable {
    protected String path;
    transient protected ImageView img;
    protected int width;
    protected int height;
    protected int col;
    protected int row;
    protected Position position;

    public GameElements(String path, int width, int height, int col, int row){
        this.path = path;
        this.width = width;
        this.height = height;
        this.row = row;
        this.col = col;
    }

    public void makeImage(Pane pane){
        img = new ImageView();
        Image im=new Image(path,(double) width,(double) height,false,false);
        img.setImage(im);
        pane.getChildren().add(img);
        this.position = new Position(col, row, col * width, row * height);
    }

    public void destroy(){
        img.setVisible(false);
    }

    public Position getPosition(){
        return position;
    }
}
