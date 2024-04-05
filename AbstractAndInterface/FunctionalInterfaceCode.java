
@FunctionalInterface
interface A{
    public void StudentName();
    public static void School(){
        System.out.println("School Name : Xavier's International School ");
    }
}


public class FunctionalInterfaceCode {
    public static void main(String[] args) {
        A.School();
        A obj = () -> {
            System.out.println("Student Name Is : Tushar Karn");
        };
        obj.StudentName();
    }
}
