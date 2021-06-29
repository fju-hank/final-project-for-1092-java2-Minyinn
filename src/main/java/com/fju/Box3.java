package com.fju;

public class Box3 extends Box{
    public Box3() {
        if(length <= 35 && width <= 40 && height <=60)
            length = 35;
        width = 40;
        height = 60;
        name = "BOX 3 ";
        price = 200;

    }
}
