public class College {
    String name;
    int numStudents;
    int yearFounded;
    
    College(String name, int n2, int y) {
        this.name = name;
        numStudents = n2;
        yearFounded = y;
    }

    public static void main(String[] args) {
        College[] arr = new College[3];

        College bmc = new College("Bryn Mawr", 1600, 1863);
        College hc = new College("Haverford", 1400, 1833);
        College penn = new College("Upenn", 30000, 1783);
        
        //College[] arr = {bmc, hc, penn};
        arr[0] = bmc;
        arr[1] = hc;
        arr[2] = penn;

       String inputCollege = args[0];
      System.out.println("input: " + inputCollege); 
    }
}
