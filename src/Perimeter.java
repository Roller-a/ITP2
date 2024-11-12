public class Perimeter {
    public static int Circle(int r) {
        return (int) (2 * r * Math.PI);
    }
    public int Square(int r) {
        return (int) (4 * r);
    }
    public int Triangle(int r, int p, int q) {
        return (int) (r + q + p);
    }
    public int Ellips (int a, int b) {
        return (int) (4 * (((Math.PI * a * b) + (a - b))/ (a + b)) );
    }
    public int Rectangle(int a, int b) {
        return (int) (2 * (a + b));
    }
}
