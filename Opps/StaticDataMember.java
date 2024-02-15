public class StaticDataMember {
    String name ;
    int roll ;
    static String cName = "Lovely Professional University ";
    StaticDataMember(String x , int y){
        name =x;
        roll = y;
    }
    void display(){
        System.out.println("Student Name is "+name+" Roll "+roll+" College name "+cName);
    }
    public static void main(String[] args) {
        StaticDataMember obj = new StaticDataMember("TUSHAR KARN",10);
        obj.display();
    }
}
