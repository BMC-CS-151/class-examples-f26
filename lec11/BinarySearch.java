public class BinarySearch {
    //returns the index of the target (if it exists in data)
    private static int binarySearch(int[] data, int target, int low, int high) {
        int midIndex = (high+low) / 2; 
        int midVal = data[midIndex]; 
        System.out.println("Checking mid index "+ midIndex);

        if (low == high && high == midIndex && midVal != target) {
            return -1;
        }

        if (midVal == target) {
            return midIndex;
        } else if (target < midVal ) {
            //search left
            return binarySearch(data, target, low, midIndex-1);
        } else { //target > midVal
            //search right
            return binarySearch(data, target, midIndex+1, high);
        }

    }

    public static int find(int[] data, int target) {
        return binarySearch(data, target, 0, data.length-1);
    }

    public static void main(String[] args) {
        int[] data = new int[8];
        //data[0] = 1;
        data[0] = 2;
        data[1] = 5;
        data[2] = 7;
        data[3] = 11;
        data[4] = 15;
        data[5] = 17;
        data[6] = 22;
        data[7] = 300;

        int index = find(data, 1);
        System.out.println(index);

        //int index2 = find(data, 99);
        //System.out.println(index2);
    }
}
