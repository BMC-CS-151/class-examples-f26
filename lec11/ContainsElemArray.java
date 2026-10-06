public class ContainsElemArray {
    private static boolean helper(String e, String[] arr, int index) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index].equals(e)) {
            return true;
        } else {
            return helper(e, arr, index+1);
        }
    }

    public static boolean containsElem(String e, String[] arr) {
            return helper(e, arr, 0);    
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};

        System.out.println(containsElem("cherry", arr));
        System.out.println(containsElem("lemon", arr));
    }
}
