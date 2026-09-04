package lec4_lists1;

public class IntListTools {
    /** Returns a copy of L, with each value incremented by x.
     *  Because this is "non-destructive", the list at L should
     *  not be modified.
     */
    public static IntList incrementRecursiveNonDestructive(IntList L, int x) {
        if (L == null) {
            return null;
        }
        IntList incrementedList = new IntList(L.first + x, null);
        incrementedList.rest = incrementRecursiveNonDestructive(L.rest, x);
        return incrementedList;
    }
}
