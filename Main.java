import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 关键：这里声明的类型是抽象类 Shape
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2,"red"));
        shapes.add(new Rectangle(3, 4, "blue"));
        shapes.add(new Triangle(6, 4, "green"));
        shapes.add(new Square(5,"green"));
        double total = 0;
        for (Shape s : shapes) {
            System.out.printf("%s 面积 = %.2f,颜色为%s\n", s.name(), s.area(),s.getColor());
            total += s.area();
        }
        System.out.printf("总面积 = %.2f%n", total);
    }
}