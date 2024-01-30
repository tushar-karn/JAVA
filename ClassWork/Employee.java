// wap a program to calculate gross salary of a employe and print gross salary assume that you have 3 command line args that are basic salary, DA, hr . 
// and class name should be employee

public class Employee{
    public static void main(String[] args) {
        double BaseSalary = Double.parseDouble(args[0]);
        double DA = Double.parseDouble(args[1]);
        double HR = Double.parseDouble(args[2]);
        double Gross = BaseSalary+DA+HR;
        System.out.println(Gross);
    }
}
