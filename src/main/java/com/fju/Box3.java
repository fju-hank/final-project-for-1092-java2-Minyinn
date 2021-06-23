package com.fju;

public class Box3 extends Box{
    public Box3() {
        if(length <= 15 && width <= 10 && height <=10)
        length = 15;
        width = 10;
        height = 10;
        name = "BOX 3 ";
        price = 60;

    }
}
