public  class Square extends Shape {
    private final double side;
    public  Square(double side, String color) {
        super(color);
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String name() {
        return "正方形";
    }
}
