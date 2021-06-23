package com.fju;

public class Box1 extends Box{
    public Box1() {
        if(length <= 5 && width <= 10 && height <=10)
        length = 5;
        width = 10;
        height = 10;
        name = "BOX 1 ";
        price = 40;

    }
}
