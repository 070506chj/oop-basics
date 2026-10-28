/** 实现类：圆 */
public class Circle implements Shape {

    private final double radius;      // 半径，private 表示外部不能直接改

    public Circle(double radius) {    // 构造方法：new 的时候执行
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String name() {
        return "圆";
    }
}