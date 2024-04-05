class A{
    public void Show(){
        System.out.println("JAi HO ");
    }
}

public class AnonimusClassCode {
    public static void main(String[] args) {
        A obj = new A(){
            public void Show(){
                System.out.println("Game  HO ");
            }
        };
        obj.Show();
    }
}
