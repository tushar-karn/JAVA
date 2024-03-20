import java.util.Scanner;

 class StaticMemberFunction {
    int roll; 
    String name ;
    static String c_name = "LPU";
    StaticMemberFunction(int roll , String name){
        this.name =name;
        this.roll=roll;
    }
    // normal function
    void putData(){
        System.out.println("Student roll is "+roll);
        System.out.println("Student name is "+name);
        System.out.println("Sudent college name is "+c_name);
    }
    // static member function
    static void updateData(){
        c_name = "IITD";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        StaticMemberFunction obj = new StaticMemberFunction(roll, name);
        obj.putData();
        StaticMemberFunction.updateData();
        obj.putData();
    }
}
