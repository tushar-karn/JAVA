import java.io.*;
import java.io.Serializable;
public class Student implements Serializable{
    int id;
    String name;
    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }
}
