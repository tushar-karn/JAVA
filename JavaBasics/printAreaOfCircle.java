package JavaBasics;
import java.util.Scanner;
public class printAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float areaOfCircle = 3.14f * radius * radius;
        System.out.println(areaOfCircle);
    }
}