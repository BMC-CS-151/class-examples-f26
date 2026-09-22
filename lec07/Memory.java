public class Memory {

   public static void main(String[] args) {
        int x = 28;

        Student c = new Student("cinnabon", 4);
        Student e = new Student("edinella", x);

        c.setBff(e);

        System.out.println("My bff is: " + e.getBff().name);
   }
}
