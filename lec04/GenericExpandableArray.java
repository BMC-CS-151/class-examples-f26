public class GenericExpandableArray <T> {

  //TODO 1: Private member variables
  private T[] data;
  private int size; //capacity of data
  private int numElems;
    
  //TODO 2: Define a value constructor which takes an initial size
  public GenericExpandableArray(int size) {
        //this.data = (T[]) new Object[size]; 
        this.data =  new T[size]; 
        this.size = size;
        this.numElems = 0;
  }
  
  //TODO 3: 
  public void insert(T elem) {
       //assume array not full
       if (numElems != size) {
           data[numElems] = elem; 
           numElems += 1;
       } else {
            System.out.println("Array is full");
       }
  }
  // Define an insert method which takes an element to insert 
  //        and inserts it at the end of the array
  // assume our internal array isnt full
  // Q: what should we do if our array is full? You'll implement this in Lab 2 
  //
  // Q: how could we define an insert which puts an element at the beginning?
  // You'll also implement this in Lab 2


  //TODO 4: 
  //arr[i] => arr.get(i)
  public T get(int index) {
      //assumes index < data.length
      return this.data[index];
  }

  // Define a get method which takes an index 
  //    and returns the element at that index
  //
  // assume index is in bounds
  // How could we handle it if index is out of bounds?
  // You'll also implement this in Lab 2

  //remove the last element
  public void remove() {
        this.data[numElems-1] = null; 
        numElems -= 1;
  }

  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.numElems; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    //int[] x = new int[]{1, 2, 3}; /
    GenericExpandableArray<Integer> e = new GenericExpandableArray(10);
    e.insert(100);

    GenericExpandableArray<String> e2 = new GenericExpandableArray(10);
  }
}
