class Fun{
    <T> void genricDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
}
public class Nd {
    public static void main(String[] args) {
        Fun obj = new Fun();
        obj.genricDisplay(10);
        obj.genricDisplay("Tushar");
        obj.genricDisplay("A");
        obj.genricDisplay(11.0);
    }
}
