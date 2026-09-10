public class ExpandableArray {

  //TODO 1: Private member variables
  private Integer[] data;
  private int size; //capacity of data
  private int numElems;
    
  //TODO 2: Define a value constructor which takes an initial size
  public ExpandableArray(int size) {
       this.data = new Integer[size];
        this.size = size; 
        this.numElems = 0;
  }

      public boolean isSorted() {
         for (int i=0; i<numElems-1; i++) {
                Integer curElem = data[i];
                Integer nextElem = data[i+1];
                if (curElem > nextElem) {
                    return false;
                } 
          }
         return true;
      }

    public Integer max() {
        Integer curMax = data[0];
        for (int i=1; i<numElems; i++) {
            if (data[i] > curMax) {
                curMax = data[i];
            } 
        }
        return curMax;
    }



  
  //TODO 3: 
  // Define an insert method which takes an element to insert 
  //        and inserts it at the end of the array
  // assume our internal array isnt full
  // Q: what should we do if our array is full? You'll implement this in Lab 2 
  //
  // Q: how could we define an insert which puts an element at the beginning?
  // You'll also implement this in Lab 2
  public void insert(int elem) {
       //assume array not full
        data[numElems] = elem;      
        numElems++;
  }

  //    remove the last element
  public void remove() {
        data[numElems-1] = null; 
        numElems--;
  }


  //TODO 4: 
  //// Define a get method which takes an index 
  //    and returns the element at that index
  //
  // assume index is in bounds
  // How could we handle it if index is out of bounds?
  // You'll also implement this in Lab 2
  //arr[i] => arr.get(i)
  public int get(int index) {
      //assumes index < data.length
      return data[index];
  }

  
  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.numElems; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    //int[] x = new int[]{100, 15, 3}; /

    ExpandableArray e = new ExpandableArray(3);
    System.out.println("Max: " + e.max());
    e.insert(100);
    e.insert(15);
    e.insert(3);
    e.print();
    System.out.println("Sorted? " + e.isSorted());

    e.remove();
    e.remove();
    e.remove();

    e.insert(0);
    e.insert(1);
    e.insert(2);
    System.out.println("Sorted? " + e.isSorted());

    e.remove();
    e.remove();
    e.remove();

    e.insert(0);
    e.insert(2);
    e.insert(1);
    System.out.println("Sorted? " + e.isSorted());

    e.remove();
    e.remove();
    e.remove();

    System.out.println("Sorted? " + e.isSorted());

    e.insert(0);
    System.out.println("Sorted? " + e.isSorted());

    //System.out.println("After removal");
    //e.remove();
    //e.print();

    //System.out.println(e.get(1));
  }
}
