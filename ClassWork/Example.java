class Example {
    static int staticDataMember = 10;
    int nonStaticDataMember = 20;

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.staticDataMember); // Accessing static member using class name
        // System.out.println(obj.staticDataMember); // This line would result in a compiler warning
        System.out.println(obj.nonStaticDataMember); // Accessing non-static member using object
    }
}

