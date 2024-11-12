public class Circle {
    protected double radius;
}
class Circle1 extends Area {
    protected double radius;
    public int AreaCircle(int radius) {
        this.radius = radius;
        return Area.Circle(radius);
    }
}
class Circle2 extends Perimeter {
    protected double radius;
    public int PerimeterCircle(int radius) {
        this.radius = radius;
        return Perimeter.Circle(radius);
    }
}