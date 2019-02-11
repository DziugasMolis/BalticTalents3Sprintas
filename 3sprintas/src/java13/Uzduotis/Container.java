package java13.Uzduotis;


public class Container<T>  {
    private int size;     // number of elements
    private T[] elements;

    public Container() {         // constructor
        elements = (T[]) new Object[10];  // allocate initial capacity of 10
        size = 0;
    }

    public void add(T o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
            // allocate a larger array and add the element, omitted
        }
        ++size;
    }

    public T get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (T)elements[index];
    }

    public T[] getAll() {
        return elements;
    }

    private static <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest]) <= 0) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);  // swap smallest to front
        }
    }

    public int size() { return size; }

    public void set(Integer index, T value) {
        if(elements.length >= index) {
            elements[index] = value;
        }
    }
}
