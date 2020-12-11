package ru.kpfu.itis.pixel_battle.protocol;

public enum Type {
    TEXT("TEXT"),
    FILE("FILE");

    private String type;

    Type(String type) {
        this.type = type;
    }
}