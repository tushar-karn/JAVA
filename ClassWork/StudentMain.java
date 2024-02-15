class Student{
    String id;
    String name;
    String roll;
    String sec;
    Student(String id , String name , String roll , String sec){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.sec = sec;
    }
    public String toString(){
        return "Student [id = "+id+", name = "+name+" , age = "+roll+" ,  section "+sec+" ]";
    }
}
class StudentMain {
    public static void main(String[] args) {
        Student obj = new Student (args[0] ,args[1] ,args[2] ,args[3]);
        System.out.println(obj);
    }
}
