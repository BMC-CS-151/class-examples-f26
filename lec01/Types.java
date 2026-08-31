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

        //both of these will fail to compile
        //the compiler enforces types
        int bad = add(3, "4");
        String s = add(3, 4);

        //you can turn values of one type into another type 
        //this is called "casting"
        
        //int to double 


        //double to int

        //String to int  (Integer.parseInt)

        //int to String (String.valueOf)
    }

}
