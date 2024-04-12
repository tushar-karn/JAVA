import java.io.*;

public class FileIo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Tushar\\Desktop\\Angular\\tushar.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
