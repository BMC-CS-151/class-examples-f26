public class InstanceOf {
    static class A {} 
    static class B extends A{} 
    static class C extends B{}
    public static void main(String[] args) {
        A[] as = {new A(), new B(), new C()};
        for (int i=0; i<as.length; i++) {
            System.out.print((as[i] instanceof A)+ " ");
            System.out.print((as[i] instanceof B)+ " ");
            System.out.println(as[i] instanceof C);
        }

    }
}
