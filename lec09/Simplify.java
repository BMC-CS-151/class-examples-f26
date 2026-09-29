import java.util.Stack;

public class Simplify {

    public static String simplify(String path) {
        String[] pathElems = path.split("/");
        Stack<String> s = new Stack<String>();

        for (int i=0; i<pathElems.length; i++) {
            String dir = pathElems[i];
            //System.out.println(dir);

            if (!dir.equals("..")) {
                s.push(dir);
            } else {
                s.pop(); //removes the matching dir 
            }
        }

        String out = "";
        while (!s.isEmpty()) {
            out = s.pop() + "/" + out;
        }
       
       return out;
    }

    public static void main(String[] args) {
        System.out.println(simplify("home/student/../cs151"));
        System.out.println(simplify("a/b/../c"));
        System.out.println(simplify("a/b/c/../../d"));
        System.out.println(simplify("a/b/../../x"));
    }

}
