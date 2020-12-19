package ru.kpfu.itits.pixel_battle.client.model.floors;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import ru.kpfu.itits.pixel_battle.client.model.GameElements;

public abstract class Floor extends GameElements {
    protected int col;
    protected int row;

    public Floor(String path, int width, int height, int col, int row) {
        super(path, width, height, col, row);
        this.col = col;
        this.row = row;
    }

    public void makeImage(GridPane lawn){
        img = new ImageView();
        Image im = new Image(path, width, height,false,false);
        img.setImage(im);
        lawn.add(img, col, row,1,1);
    }
}

