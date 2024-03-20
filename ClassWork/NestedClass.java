class NestedClass {
    static int age = 20;
    static int roll = 10 ; 
    static class InnerNestedClass {


        void fun(){
            NestedClass obj1 = new NestedClass();
            System.out.println(obj1.age); 
            System.out.println(age);
            System.out.println(roll);


        }
    }

    public static void main(String[] args) {
        NestedClass.InnerNestedClass obj = new NestedClass.InnerNestedClass();
        obj.fun();
    }
}

