package lec7_lists3;

// let's make SLLists generic, so they can store anything

// to make a class have a type parameter
// add <???> at the declaration of the class name
// with whatever you please between the <>

// in the example below we selected Cow (heh heh)
// which is a placeholder for whatever type someone
// gives us, like say String
public class SLList<Cow> {
    // nobody else would ever use IntNode
    // except for this class (SLList), so let's make it
    // private
    private class Node {
        public Cow item; // this is the first item in the list
        public Node next; // this is the rest of the list

        public Node(Cow x, Node r) {
            item = x;
            next = r;
        }
    }

    private Node sentinel;
    private int size; // how many things are in the list

    // sentinel.item is not useful
    // the first real item is at sentinel.next.item

    /** Create an SLList with x in it. */
    public SLList(Cow x) {
        size = 1;
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
    }

    // creates an empty list */
    public SLList() {
        size = 0;
        sentinel = new Node(null, null);
    }

    /** Adds x to the front of the list */
    public void addFirst(Cow x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    public Cow getFirst() {
        return sentinel.next.item;
    }

    /** Return the number of things in this SLList.
     *  Will do this recursively. */
    public int size() {
        return size;
    }

    // add to the end of the list */
    public void addLast(Cow x) {
        size += 1;

        Node p = sentinel;
        // inch p along until it's the last item
        while (p.next != null) {
            p = p.next;
        }

        p.next = new Node(x, null);
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
        SLList<String> L = new SLList<>();
        L.addLast("cat");
        L.addLast("machine");
    }
}
