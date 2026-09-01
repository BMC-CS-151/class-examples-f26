public class Types {
    
    //when you define a method, 
    //you need to declare types of the arguments and
    //the return type
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        //when you declare a variable,
        //you also need to declare the types.
        int sum = add(3, 4); 

        /*both of these will fail to compile
        //the compiler enforces types
        //*/
        //int bad = add(3, "4");
        //String s = add(3, 4);

        //you can turn values of one type into another type 
        //this is called "casting"
        
        //int to double 
        int x = 50;
        double y = (double) x;
        System.out.println("my double " + y);
        //System.out.print();

        //double to int
        int myint = (int) 99.99998;
        System.out.println("my int " + myint);
        
        //String to int  (Integer.parseInt)
        int foo = Integer.parseInt("88");
        System.out.println("str to int: " + foo);

        //int to String (String.valueOf)
        String myAge = String.valueOf(66.66);
        System.out.println("my age is: "  + myAge);

        int[][] sarr = new int[3][3];
        System.out.println(sarr[0]);
    }

}
