package TASK15;

public class Task15 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Blue", 1,4);
        Circle c = new Circle("color",1);
        System.out.println("Circle Area     :" +c.calculateArea());
        System.out.println("Circle Perimeter:" +c.calculatePerimeter());

        System.out.println("Rectangle Area     : " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());




    }





}
