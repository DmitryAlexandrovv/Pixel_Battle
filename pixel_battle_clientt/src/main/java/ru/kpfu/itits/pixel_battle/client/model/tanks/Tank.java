package ru.kpfu.itits.pixel_battle.client.model.tanks;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import ru.kpfu.itits.pixel_battle.client.model.GameElements;
import ru.kpfu.itits.pixel_battle.client.model.Position;
import ru.kpfu.itits.pixel_battle.client.model.tanks.shots.PixelTankShot;
import ru.kpfu.itits.pixel_battle.client.model.tanks.shots.Shot;

public abstract class Tank extends GameElements {
    protected int col;
    protected int row;
    protected double damage;
    protected int hp;
    protected double shotSpeed;
    protected double speed;
    protected Position position;

    public Tank(String path, int width, int height, int col, int row, double damage, int hp, double shotSpeed, double speed) {
        super(path, width, height, col, row);
        this.col = col;
        this.row = row;
        this.damage = damage;
        this.hp = hp;
        this.shotSpeed = shotSpeed;
        this.speed = speed;
    }

    public void makeImage(GridPane lawn){
        img = new ImageView();
        Image im = new Image(path, width, height,false,false);
        img.setImage(im);
        lawn.add(img, col, row,1,1);
        this.position = new Position(col, row, col * 50 + 20, row * 50 - 20); // слева сниз значит минус остаток
    }

    public double getChangeXForw(){
        return Math.sin(Math.toRadians(getRotate())) * this.getSpeed();
    }

    public double getChangeYForw(){
        return Math.cos(Math.toRadians(getRotate())) * this.getSpeed();
    }

    public double getChangeXBack(){
        return Math.sin(Math.toRadians(getRotate())) * (-this.getSpeed());
    }

    public double getChangeYBack(){
        return Math.cos(Math.toRadians(getRotate())) * (-this.getSpeed());
    }

    public void tankMoveForward()
    {
        double rotate = img.getRotate();
        double changeX = Math.sin(Math.toRadians(rotate)) * this.getSpeed();
        double changeY = Math.cos(Math.toRadians(rotate)) * this.getSpeed();
        img.setTranslateX(img.getTranslateX() + changeX);
        img.setTranslateY(img.getTranslateY() - changeY);

        this.position.setX(changeX * (-1));
        this.position.setY(changeY * (-1));
//        this.position.setCol((int)(this.position.getX()) / 50);
//        this.position.setRow((int)(this.position.getY()) / 50);
    }

    public void tankMoveBack(){
        double rotate = img.getRotate();
        double changeX = Math.sin(Math.toRadians(rotate)) * (-this.getSpeed());
        double changeY = Math.cos(Math.toRadians(rotate)) * (-this.getSpeed());
        img.setTranslateX(img.getTranslateX() + changeX);
        img.setTranslateY(img.getTranslateY() - changeY);

        this.position.setX(changeX * (-1));
        this.position.setY(changeY * (-1));
//        this.position.setCol((int)(this.position.getX()) / 50);
//        this.position.setRow((int)(this.position.getY()) / 50);
    }

    public void tankRotateLeft(){
        img.setRotate(img.getRotate() - 1);
    }

    public void tankRotateRight(){
        img.setRotate(img.getRotate() + 1);
    }

    public void tankRotateLeft(double deg){
        img.setRotate(img.getRotate() - deg);
    }

    public void tankRotateRight(double deg){
        img.setRotate(img.getRotate() + deg);
    }

    public Shot tankFire(){
        PixelTankShot shot = new PixelTankShot(this.position.getCol(), this.position.getRow(), 10, 10, this);
        return shot;
    }

    public double getCenterX(){
        return img.getLayoutX() + img.getTranslateX() - 5 + 15 - 5; // Некий отсуп(хз чо это), в центр и минус половина ширины
    }

    public double getCenterY(){
        return img.getLayoutY() + img.getTranslateY() - 15 + 5; // в центр и минус половина ширины
    }

    public double getX(){
        double rotate = img.getRotate();
        return getCenterX() + Math.sin(Math.toRadians(rotate)) * 30;
    }

    public double getY(){
        double rotate = img.getRotate();
        return getCenterY() - Math.cos(Math.toRadians(rotate)) * 30;
    }

    public double getRotate(){
        return img.getRotate();
    }

    public double getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public double getShotSpeed() {
        return shotSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setX(double x){
        img.setTranslateX(x);
    }

    public Position getPosition(){
        return position;
    }
}
