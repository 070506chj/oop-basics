/** 抽象类,存入状态,拥有已经实现的方法 */
public abstract class Shape {
    protected final String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double area();      // 求面积
    public abstract String name();      // 名字
}