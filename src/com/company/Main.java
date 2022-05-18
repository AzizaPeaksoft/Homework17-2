package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        Shape shape4 = new Dot();
        Shape shape5 = new Triangle();

        System.out.println(shape1.getPerimeter());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape4.getPerimeter());
        System.out.println(shape5.getPerimeter());

    }
}
