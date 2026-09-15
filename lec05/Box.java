public class Box<T> {
    private T[] data;
    private int numElems;

    public Box(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.numElems = 0;
    }

    public T get(int idx) {
        if (idx < data.length) {
            return this.data[idx];
        } else {
            return null;
        }
    }

    public void add(T item) {
        if (numElems != data.length) {
            this.data[numElems]  = item;
            this.numElems++;
        } else {
            throw new BoxFullException("can't add to a full box");
        }
    }

    public static void main(String[] args) {
       Box<String> b = new Box<String>(1); 
       b.add("Hello World");

       Box<Integer> b2 = new Box<Integer>(1);
       b2.add(99);
    }

/*
get(int i) returns the element at index i.
*/

}
