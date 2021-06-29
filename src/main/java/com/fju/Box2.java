package com.fju;

public class Box2 extends Box{
    public Box2() {
        if (length <= 20 && width <= 40 && height <= 40)
            length = 20;
        width = 40;
        height = 40;
        name = "BOX 2 ";
        price = 150;

    }
}
