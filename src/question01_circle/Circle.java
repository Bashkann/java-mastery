package question01_circle;

public class Circle {
    // Özellik (Field)
    private double radius;
    private final double PI = Math.PI; // Java'nın kendi PI değerini kullanmak daha profesyoneldir

    // Kurucu Metot (Constructor)
    public Circle(double radius) {
        this.radius = radius;
    }

    // Alan Hesaplama Metodu (Method to calculate area)
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Çevre Hesaplama Metodu (Method to calculate circumference)
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Getter (Yarıçapı okumak istersen)
    public double getRadius() {
        return radius;
    }
}