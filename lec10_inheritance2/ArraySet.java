package lec10_inheritance2;

import java.util.Iterator;
import java.util.List;

// saying implements Iterable<T>
// is the magic ingredient so that : works properly as in for (int i : aset)


// I NEED TO MAKE SURE THAT JAVA KNOWS THERE IS AN ITERATOR
// METHOD IN ARRAYSET.

// In some programming languages, it would just check automatically,
// but in Java, hypernym/hyponym relationsips require the use
// of the implements (for today) keyword.


// Implements Iterable<T>, this means, I am formally saying
// that I am something that is Iterable, i.e. I have a
// .iterator method.
public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ArraySet otherArraySet) {
            // if this is true, then we know o is an ArraySet
            // unfortunately,the type of o is still not ArraySet

            // instanceof does two things:
            //   It returns true if o is an Arraseyt
            //   It reincarnates the other arrayset as otherArraySet (or whatever name you pick)
            // This is called "pattern matching"

            // size
            // items
            if (this.size == otherArraySet.size) {
                for (T x : this) {
                    if (!otherArraySet.contains(x)) {
                        return false;
                    }
                }
            } else {
                return false;
            }
            // checked all items and theya re also an arrayset
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);

        /* won't work yet */
        // JAVA is unhappy right now, because it does not
        // know that ArraySets have an iterator method.
        for (int i : aset) {
            System.out.println(i);
        }




        System.out.println(aset);
        ArraySet<Integer> aset2 = new ArraySet<>();
        aset2.add(5);
        aset2.add(23);
        aset2.add(42);

        IO.println(aset.equals(aset2));
        //aset.equals(List.of(1, 2, 3));

    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("[");
        for (T x : this) {
            returnString.append(x);
            returnString.append(",");
        }
        returnString.append("]");
        return returnString.toString();
    }


    private class MagicWizard implements Iterator<T> {
        // this is where the wizard is looking in our array
        private int wizPos;

        MagicWizard() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return (wizPos < size);
        }

        public T next() {
            T itemToReturn = items[wizPos];
            wizPos += 1;
            return itemToReturn;
        }

    }

    public Iterator<T> iterator() {
        //somehow i have to return some sort of magic
        //wizard who has a next and hasNext method

        return new MagicWizard();
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
