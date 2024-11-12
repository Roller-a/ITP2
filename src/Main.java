//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Area a = new Area();
        Perimeter p = new Perimeter();
        Circle1 c = new Circle1();
        Circle2 c2 = new Circle2();
        System.out.println("Area " + c.AreaCircle(5));
        System.out.println("Perimeter " + c2.PerimeterCircle(5));
        System.out.println(a.Circle(5));
        System.out.println(p.Circle(5));
    }
}