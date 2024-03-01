import java.util.Scanner;
class Person{
    String name ; 
    int age ;
    int roll;
    void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME");
        name = sc.nextLine();
        System.out.println("ENTER AGE");
        age = sc.nextInt();
        System.out.println("ENTER ROLL");
        roll = sc.nextInt();
    }
    void displayInfo(){
        System.out.println("NAME IS "+name);
        System.out.println("ROLL IS "+roll);
        System.out.println("AGE IS "+age);
    }
}
class Student extends Person{
}
public class Inheritance {
public static void main(String[] args) {
    Student obj = new Student();
    obj.getInfo();
    obj.displayInfo();
}
}
