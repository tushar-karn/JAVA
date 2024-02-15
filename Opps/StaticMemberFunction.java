public class StaticMemberFunction {
    String name ;
    int roll ;
    static String school = "XAVIERS";
    StaticMemberFunction(String x , int y){
        name =x;
        roll = y;
    }
    void display(){
        System.out.println("name is "+name+" Roll Is "+roll+" School is "+school);
    }  
    static void change(){
        school = "LPU";
    }
    public static void main(String[] args) {
        StaticMemberFunction obj = new StaticMemberFunction("Tushar Karn", 10);
        obj.display();
        StaticMemberFunction.change();
        obj.display();
    } 
}
