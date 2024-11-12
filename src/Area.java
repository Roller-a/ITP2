public class Area {
    public static int Circle(int radius) {
        return (int) (radius * radius * Math.PI);
    }
    public int Rectangle(int a, int b) {
        return (int) (a * b);
    }
    public int Triangle(int a, int h) {
        return (int) (a * h / 2);
    }
    public int Square(int a) {
        return (int) (a * a);
    }
    public int Ellipse(int a, int b) {
        return (int) (a * b * Math.PI);
    }
}