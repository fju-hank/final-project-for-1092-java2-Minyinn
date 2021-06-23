package com.fju;

public class Box2 extends Box{
    public Box2() {
        if (length <= 10 && width <= 10 && height <= 10)
        length = 10;
        width = 10;
        height = 10;
        name = "BOX 2 ";
        price = 50;

    }
}
