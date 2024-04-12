import java.util.*;
class Student <T, T1>{
    T regno;
    T rollNo;
    T1 name;
    void getData(T a , T b , T1 c){
        this.regno = a;
        this.rollNo = b;
        this.name = c;
    }
    void Display(){
        System.out.println("regno is : " +regno);
        System.out.println("roll is : " +rollNo);
        System.out.println("name is : " +name);
    }
}
class O1Genric {
    public static void main(String[] args) {
        Student<Integer , String> obj = new Student<Integer , String>();
        obj.getData(12205429 , 10 , "Tushar Karn");
        obj.Display();
     }
    
}


