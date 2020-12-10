package itis.model;


import itis.model.tanks.shots.Shot;

public interface Destroymable {
    public boolean destroy(Shot shot);
}
