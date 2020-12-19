package ru.kpfu.itits.pixel_battle.client.model.walls;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import ru.kpfu.itits.pixel_battle.client.model.GameElements;
import ru.kpfu.itits.pixel_battle.client.model.Position;

public abstract class Wall extends GameElements {
    protected int col;
    protected int row;
    protected Position position;

    public Wall(String path, int width, int height, int col, int row) {
        super(path, width, height, col, row);
        this.col = col;
        this.row = row;
        this.position = new Position(col, row, col * 50, row * 50 );
    }

    public void makeImage(GridPane lawn){
        img = new ImageView();
        Image im = new Image(path, width, height,false,false);
        img.setImage(im);
        lawn.add(img, col, row,1,1);
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
