import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMap<K,V> implements Map<K,V> {
    private AbstractMap.MapEntry<K,V>[] arr;
    private int numElems;

    public ArrayMap(int capacity) {
        arr = new AbstractMap.MapEntry[capacity];
    }

    public int size() {
        return numElems;
    }

    public boolean isEmpty() {
        return numElems == 0;
    }

    public V put(K key, V value) {
        //insert or a set
        for (int i=0; i<numElems; i++) {
            if (arr[i].getKey().equals(key)) {
                //set
                V oldValue = arr[i].getValue();
                arr[i].setValue(value);
                return oldValue;
            }
        }
        arr[numElems] = new AbstractMap.MapEntry(key, value);
        return null;
    }

    public V get(K key) {
        for (int i=0; i<numElems; i++) {
            if (arr[i].getKey().equals(key)) {
                return arr[i].getValue(); 
            }
        }
        return null;
    }


    public V remove(K key) {
        for (int i=0; i<numElems; i++) {
            if (arr[i].getKey().equals(key)) {
                V oldValue = arr[i].getValue();
                arr[i] = null;
                return oldValue;
            }
        }
        return null;
    }

    public Iterable<Entry<K,V>> entrySet() {
            ArrayList<Entry<K,V>> arr2 = new ArrayList(Arrays.asList(arr));
            return arr2;
    }
    
    public  Iterable<V> values() {
        ArrayList<V> arr3 = new ArrayList();
        for (int i=0; i<arr.length; i++) {
            arr3.add(arr[i].getValue());
        }
        return arr3;
    }

    public Iterable<K> keySet() {
        ArrayList<K> arr3 = new ArrayList();
        for (int i=0; i<arr.length; i++) {
            arr3.add(arr[i].getKey());
        }
        return arr3;
    }
}
