import java.io.*;

public class Nd {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(211, "Tushar");

        // Specify the file name with extension
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Tushar\\Desktop\\JAVA\\ClassWork\\student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        
        // Close the output streams
        out.close();
        fout.close();
        
        System.out.println("Success");
    }
}
