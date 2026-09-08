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

  //TODO 5: 
  //    remove the last element
  //
  //Q: What if the underlying array is full?
  //Q: What if there is no last element
  public void remove() {
        data[numElems] = null; 
        numElems--;
  }

  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.numElems; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    //int[] x = new int[]{100, 15, 3}; /
    ExpandableArray e = new ExpandableArray(10);
    e.insert(100);
    e.insert(15);
    e.insert(3);
    e.print();

    System.out.println("After removal");
    e.remove();
    e.print();

    System.out.println(e.get(1));
  }
}
