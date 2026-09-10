package lec6_lists2;

public class SLList {
    // nobody else would ever use IntNode
    // except for this class (SLList), so let's make it
    // private
    private class IntNode {
        public int item; // this is the first item in the list
        public IntNode next; // this is the rest of the list

        public IntNode(int x, IntNode r) {
            item = x;
            next = r;
        }
    }

    private IntNode sentinel;
    private int size; // how many things are in the list

    // sentinel.item is not useful
    // the first real item is at sentinel.next.item

    /** Create an SLList with x in it. */
    public SLList(int x) {
        size = 1;
        sentinel = new IntNode(-420, null);
        sentinel.next = new IntNode(x, null);
    }

    // creates an empty list */
    public SLList() {
        size = 0;
        sentinel = new IntNode(-420, null);
    }

    /** Adds x to the front of the list */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    /** Return the number of things in this SLList.
     *  Will do this recursively. */
    public int size() {
        return size;
    }

    // add to the end of the list */
    public void addLast(int x) {
        size += 1;

        IntNode p = sentinel;
        // inch p along until it's the last item
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    /** When you want to recurse over a non-recursive thing,
     *  use a private helper method with a variable to hold
     *  state, a.k.a. position.
     *
     *  What we'll do, somewhat strangely, is we'll
     *  build a static size method that takes an IntNode
     *  as an argument, and returns the size of the list
     *  starting with that Node.
     */
    /*public static int size(IntNode p) {
        if (p == null) {
            return 0;
        }
        return 1 + size(p.next);
    }*/

    static void main() {
        SLList L = new SLList();

        L.addLast(15);
        L.addFirst(5);
        IO.println(L.size()); // prints 2
    }
}
