
abstract class Wallpaper{
    public void show(){
        System.out.println("Enter Company");
    }
    abstract void showModel();
}
class Google extends Wallpaper{
    public void showModel(){
        System.out.println("PIXEL WALLPAPER");
    }
}
abstract class Redmi extends Wallpaper{
    public void MyClass(){
        System.out.println("HELLO PGM ");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Google obj = new Google();
        obj.showModel();
    }
}
