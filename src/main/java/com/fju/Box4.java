package com.fju;

public class Box4 extends Box{
    public Box4() {
        if(length <= 45 && width <= 50 && height <=70)
            length = 45;
        width = 50;
        height = 70;
        name = "BOX 4 ";
        price = 300;

    }
}
