package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Min's post office.");
        System.out.println("Please enter the length : ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter the width : ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter the height : ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Please confirm that it is correct ?");
        System.out.println("length: " + length +",width: " + width +",height: "+ height);

        Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4(),new Box5(),new BoxOver()};
        for (Box box : boxes) {
            if (box.validate(length,width, height)) {
                System.out.println("You get " + box.name + "/ $ : "+box.price);
                break;
            }
        }


    }
}
