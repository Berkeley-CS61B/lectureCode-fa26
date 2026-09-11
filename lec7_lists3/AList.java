package lec7_lists3;

// AList is an infinitely extensible list of intege3rs
// that uses an array under the hood.
public class AList {
    public int[] items;
    public int size;

    public AList() {
        items = new int[11];
        size = 0;
    }

    /** returns number of items in the list */
    public int size() {
        return size;
    }

    // adds an item to the end
    public void addLast(int x) {
        // items: [0 0 0 0 0 0 0 0 0 0 0 0]
        // size: 0
        items[size] = x;
        size += 1;
    }

    /** returns the ith item */
    public int get(int i) {
        return items[i];
    }
}
