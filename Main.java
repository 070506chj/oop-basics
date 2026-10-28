import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 关键：这里声明的类型是接口 Shape，不是具体的类
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(6, 4));
        shapes.add(new Square(5));
        double total = 0;
        for (Shape s : shapes) {
            System.out.printf("%s 面积 = %.2f%n", s.name(), s.area());
            total += s.area();
        }
        System.out.printf("总面积 = %.2f%n", total);
    }
}