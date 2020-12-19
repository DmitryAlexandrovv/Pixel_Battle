package ru.kpfu.itits.pixel_battle.client.model;

public class Position {
    protected double x;
    protected double y;
    protected int col;
    protected int row;

    public Position(Position position){
        this.x = position.x;
        this.y = position.y;
        this.col = position.col;
        this.row = position.row;
    }

    public Position(int col, int row, double x, double y){
        this.x = x;
        this.y = y;
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = this.x + x;
       setCol((int)(this.x) / 50);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = this.y + y;
        setRow((int)(this.y) / 50);
    }

    @Override
    public boolean equals(Object obj) {
        Position position = (Position) obj;
        if(position.col == this.col && position.row == this.row){
            return true;
        }
        return false;
    }
}
