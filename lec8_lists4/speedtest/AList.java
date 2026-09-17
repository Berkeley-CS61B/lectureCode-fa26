package lec8_lists4.speedtest;

public class AList {
    private int size;
    private int[] items;

    public AList() {
        size = 0;
        items = new int[100];
    }

    // [3, 4, 2, 0, 0, 0, ....]
    //           ^ (size = 3)
    // size is the location of the next add
    // size - 1 location of the last item

    public void addLast(int x) {
        if (size == items.length) {
            resize((int) (size * 1.1));





            // other resizing strategies:
            //  resize(size + 1000);
            //  resize(size * 2));
            //  resize((int) (size * 1.1));
        }
        items[size] = x;
        size += 1;
    }

    private void resize(int newSize) {
        int[] a = new int[newSize];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public int getLast() {
        return items[size - 1];
    }

    public int get(int i) {
        return items[i];
    }

    public int removeLast() {
        int itemToReturn = getLast();
        size -= 1;
        return itemToReturn;
    }
}
