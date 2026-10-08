public class TernarySearch {

    public static int ternarySearch(int[] a, int target) {
       return helper(a, target, 0, a.length-1); 
    }

    private static int helper(int[] a, int target, int low, int high) {
        if (low > high) return -1;
        int third = (high - low) / 3;
        int m1 = low +  third; 
        int m2 = high - third;

        System.out.println("\t m1: " + m1 + " a[m1]" + a[m1]);
        System.out.println("\t m2: " + m2 + " a[m2]" + a[m2]);

        if (a[m1] == target) return m1;
        if (a[m2] == target) return m2;

        if (target < a[m1]) {
            return helper(a, target, low, m1-1);
        } else if (target > a[m1] && target < a[m2]) {
            return helper(a, target, m1+1, m2-1);
        } //else if (target > a[m2]) {
        else {
            return helper(a, target, m2+1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 11, 15, 19, 23, 27, 28, 29};
        int target = 4;
        int index = ternarySearch(a, target);
        System.out.println(index);
    } 
}
