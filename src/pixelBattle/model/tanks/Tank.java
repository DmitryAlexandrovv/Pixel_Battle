package pixelBattle.model.tanks;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import pixelBattle.model.GameElements;

import java.io.Serializable;

public abstract class Tank extends GameElements {
    protected int col;
    protected int row;

    public Tank(String path, int width, int height, int col, int row) {
        super(path, width, height);
        this.col = col;
        this.row = row;
    }

    public void makeImage(GridPane lawn){
        img = new ImageView();
        Image im = new Image(path, width, height,false,false);
        img.setImage(im);
        lawn.add(img, col, row,1,1);
    }

    public void tankMoveForward()
    {
        double rotate = img.getRotate();
        img.setTranslateX(img.getTranslateX() + Math.sin(Math.toRadians(rotate)) * 2);
        img.setTranslateY(img.getTranslateY() - Math.cos(Math.toRadians(rotate)) * 2);
    }

    public void tankMoveBack(){
        double rotate = img.getRotate();
        img.setTranslateX(img.getTranslateX() + Math.sin(Math.toRadians(rotate)) * (-2));
        img.setTranslateY(img.getTranslateY() - Math.cos(Math.toRadians(rotate)) * (-2));
    }

    public void tankRotateLeft(){
        img.setRotate(img.getRotate() - 1);
    }

    public void tankRotateRight(){
        img.setRotate(img.getRotate() + 1);
    }
}
