public class Types {

  public static void adjustBox(Box b) {
      //does something
  }


  public static void main(String[] args) {
        Box b = new Box(5);
        adjustBox(b);

        LabeledBox b2 = new LabeledBox(10, "box1");
        adjustBox((Box) b2);

        LabeledBox b3 = new LabeledBox(10, "box1");
    
        //add b, b2, and b3 to a boxes array
        Box[] boxes = {b, (Box) b2, (Box) b3};

        //cast the other way?
        LabeledBox lb = (LabeledBox) b;

  }

}
