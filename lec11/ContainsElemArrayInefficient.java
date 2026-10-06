public class ContainsElemArray {
    public static boolean containsElem(String e, String[] arr) {
        if (arr.length == 0) {
            return false;
        }

        if (arr[0].equals(e)) {
            return true;
        } else {
            String[] newArray = new String[arr.length-1];
            for (int i=1; i<arr.length; i++) {
                newArray[i-1] = arr[i];
            }
            return containsElem(e, newArray);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};

        System.out.println(containsElem("cherry", arr));
        System.out.println(containsElem("lemon", arr));
    }
}
