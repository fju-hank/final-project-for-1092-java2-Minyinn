package com.fju;

public class BoxOver extends Box{
    public BoxOver() {
        if (length <= 100 && width <= 100 && height <= 100)
            length = 100;
        width = 100;
        height = 100;
        name = "a no exist box.Sorry,we don't sell the size box. ";
        price = 0;

    }
}
