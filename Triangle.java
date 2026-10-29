import java.awt.*;

public class Triangle extends Shape {
    private final double height;
    private final double base;
    public Triangle(double height, double base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {

        return base*height/2;
    }

    @Override
    public String name() {
        return "三角形";
    }
}