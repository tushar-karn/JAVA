abstract class Shape{
    abstract int  numberOfSides();
}
class Trapezoid extends Shape{
    int numberOfSides(){
        return 4;
    }
}
class Triangle extends Shape {
    int numberOfSides(){
        return 3;
    }
}
class Hexagon extends Shape{
    int numberOfSides(){
        return 6;
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Shape ref = new Trapezoid();
        System.out.print("Number Of SIDES of Trapezoid ");
        System.out.println(ref.numberOfSides());
        ref = new Triangle();
        System.out.print("Number Of SIDES of Triangle ");
        System.out.println(ref.numberOfSides());
        ref = new Hexagon();
        System.out.print("Number Of SIDES of Hexagon ");
        System.out.println(ref.numberOfSides());
    }
}
