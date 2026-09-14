package lec8_lists4.speedtest;

/* List of anythings */
public class SLList<Mustard> {
    private class MustardNode {
        public Mustard item;    // first number in the list
        public MustardNode next; // rest of the list

        public MustardNode(Mustard i, MustardNode n) {
            item = i;
            next = n;
        }
    }


    // the sentinel node is the dummy node at th front of the list
    // and the real first item is sentinel.next (if it exists)
    private MustardNode sentinel;
    private int size;

    public SLList() {
        size = 0;
        sentinel = new MustardNode(null, null);
    }

    public void addFirst(Mustard x) {
        size += 1;
        sentinel.next = new MustardNode(x, sentinel.next);
    }

    public Mustard getFirst() {
        return sentinel.next.item;
    }

    public void addLast(Mustard x) {
        size += 1;
        MustardNode p = sentinel;

        // advance p until it is the last item
        while (p.next != null) {
            p = p.next;
        }

        p.next = new MustardNode(x, null);
    }

    public int size() {
        return size;
    }
}
