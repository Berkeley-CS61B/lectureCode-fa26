package lec4_lists1;

public class IntList {
    public int first; // this is the first item in the list
    public IntList rest; // this is the rest of the list

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** returns he size of this list. Me, that is. */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    // and not using recursion this time
    // we'll use a loop instead, less beautiful, but...
    // let's sully ourselves and write the code
    public int iterativeSize() {
        int totalSize = 0;
        IntList currentLocation = this;

        while (currentLocation != null) {
            totalSize += 1;
            currentLocation = currentLocation.rest;
        }

        return totalSize;
    }

    static void main() {
        /*
        // demo below showing how we add items to the end
        // we get lots of .rest.rest.rest nonsense
        IntList L = new IntList(5, null);
        // let's make some space for the next item
        L.rest = new IntList(10, null);
        // let's make some space for the next next item
        L.rest.rest = new IntList(3, null);
        */

        // an alternate approach is to add to the front
        IntList L = new IntList(3, null);
        // let's put 10 at the front
        L = new IntList(10, L);
        // then let's put 5 at the front
        L = new IntList(5, L);

        // should print 3
        System.out.println(L.iterativeSize());
    }
}