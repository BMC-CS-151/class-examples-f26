import java.util.Scanner;
import java.io.File;
import  java.io.FileNotFoundException;

public class Ex2 {
    public static void main(String[] args) {
            int count = 0;
            Scanner sc = null;
            boolean flag = false;
            String fname = "foo.txt";
            while (!flag) {
                try {
                    File f = new File(fname); 
                    sc = new Scanner(f);
                    flag = true;
                } catch (FileNotFoundException e) {
                    System.out.println("That's not a file..try again");
                    Scanner sc2 = new Scanner(System.in);
                    fname  = sc2.nextLine();
                }
            }

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                for (int i=0; i<words.length; i++) {
                    //System.out.println(words[i] + " " + words[i].equals(" "));
                    if (words[i].equals("")) {
                        continue;
                    }
                    count += 1;
                }
                //int numWords = words.length;
                //System.out.println(line + " " + numWords);
                //count += numWords;
            }

            System.out.println("Total: " + count);
    }
}
