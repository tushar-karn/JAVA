import java.io.*;

public class Nd {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\Users\\Tushar\\Desktop\\JAVA\\Sorting\\student.ser");
        ObjectInputStream in = new ObjectInputStream(fin);
        Student s1 = (Student) in.readObject();
        in.close();
        fin.close();
        System.out.println("Deserialized Student:");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }
}
