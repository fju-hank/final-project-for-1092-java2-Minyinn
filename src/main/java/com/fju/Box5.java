package com.fju;

public class Box5 extends Box{
    public Box5() {
        if(length <= 30 && width <= 90 && height <=100)
            length = 30;
        width = 90;
        height = 100;
        name = "BOX 5 ";
        price = 400;

    }
}
