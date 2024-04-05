@FunctionalInterface
interface A{
    public void StudentName();
    public static void School(){
        System.out.println("School Name : Xavier's International School");
    }
}
interface Roll extends A{
   public void StudentRoll();
}
public class AnonimusClass {
    public static void main(String[] args) {
        Roll obj = new Roll() {
            public void StudentName(){
                System.out.println("Student name is : Tushar");
            }
            public void StudentRoll(){
                System.out.println("ROLL IS 10");
            }
        };
        A.School();
        obj.StudentName();
        obj.StudentRoll();
    }
    
}
