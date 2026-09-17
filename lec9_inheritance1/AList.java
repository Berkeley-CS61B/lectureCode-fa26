package lec9_inheritance1;

// AList is an infinitely extensible list of intege3rs
// that uses an array under the hood.
public class AList<T> {
    public T[] items;
    public int size;

    public AList() {
        items = (T[]) new Object[11];
        size = 0;
    }

    /** returns number of items in the list */
    public int size() {
        return size;
    }

    private void resize(int capacity) {
        T[] resized = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            resized[i] = items[i];
        }
        items = resized;
    }


    // adds an item to the end
    public void addLast(T x) {
        // items: [0 0 0 0 0 0 0 0 0 0 0 0]
        // size: 0

        // size is the number of thins in the array / list
        // length is the length of the array

        if (size == items.length) {
            resize(size + 1);
        }

        items[size] = x;
        size += 1;
    }

    /** returns the ith item */
    public T get(int i) {
        return items[i];
    }
}
