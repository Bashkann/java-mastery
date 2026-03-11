package  question01_circle;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0); // Yarıçapı 5 olan bir daire

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Circumference: " + myCircle.calculateCircumference());
    }
}