public class Warmup2 {
    private Integer[] arr;

    public Warmup2(Integer[] data) {
        arr = data;
    }

    private int countLessThan(int x, int index) {
        if (index >= arr.length || arr[index] == null) {
            return 0;
        }

        if (arr[index] < x) {
            return 1 + countLessThan(x, 2*index+1) + countLessThan(x, 2*index+2);
        } else {
            return 0;
        }
    }

    public int countLessThan(int x) {
        return countLessThan(x, 0);  
    }
    

    public int countLessThanArr(int x) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != null && arr[i] < x) {
                count += 1 ;
            }
        }
        return count;
    }

    public void BFT() {
        int level = 1;
        for (int i=0; i<arr.length; i++) {
            if (i == Math.pow(2, level)-1) {
                System.out.println();
                level += 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void BFT1() {
        int level = 0;
        int cur = 0;
        for (int i=0; i<arr.length; i++) {
            if (cur == Math.pow(2,level)) {
                System.out.println();
                cur = 0;
                level += 1;
            }
            System.out.print(arr[i] + " ");
            cur++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Warmup2 heap = new Warmup2(new Integer[]{3, 4, 6, 15, 12, 8, 9});
        //System.out.println(heap.countLessThan(8));
        heap.BFT();

    }

}
