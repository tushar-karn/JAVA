 class Students {
    String fields;
    String name = "Tushar";
    int roll =10;
    Students(){
    }
    Students(String name){
        this.name = name;
        System.out.println(name);
    }
    Students(String namme,int roll){
        this.name= name;
        this.roll =roll;
        System.out.print(name+" ");
        System.out.println(roll);
    }
}

class Test {
    public static void main(String[] args) {
        Students obj = new Students();
        Students obj1 = new Students("Tushar");
        Students obj2 = new Students("Akash" , 10);
    }
}
