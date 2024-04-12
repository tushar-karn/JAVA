import java.io.*;

public class Nd {
    public static void main(String[] args) throws Exception {
        // Deserialization
        FileInputStream fin = new FileInputStream("C:\\Users\\Tushar\\Desktop\\JAVA\\ClassWork\\student.ser");
        ObjectInputStream in = new ObjectInputStream(fin);
        
        // Read the serialized object and cast it to Student
        Student s1 = (Student) in.readObject();
        
        // Close the input streams
        in.close();
        fin.close();
        
        // Print the deserialized Student object
        System.out.println("Deserialized Student:");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }
}
