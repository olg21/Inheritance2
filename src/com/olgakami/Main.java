package com.olgakami;

public class Main {

    public static void main(String[] args) {
	Circle cirlce = new Circle(3.75);
        System.out.println("circle.radius= " + cirlce.getRadius());
        System.out.println("circle.area= " + cirlce.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radious= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
    }
}
