package com.fju;

public class Box1 extends Box{
    public Box1() {
        if(length <= 10 && width <= 20 && height <=25)
            length = 10;
        width = 20;
        height = 25;
        name = "BOX 1 ";
        price = 100;

    }
}
