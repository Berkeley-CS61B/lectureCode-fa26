package lec5_testing;

public class Sort {
    /** Sorts the array of strings destructively. */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    /** Sort x starting from position k, leaving the first k untouched */
    public static void sort(String[] x, int k) {
        if (k >= x.length) {
            return;
        }
        int smallestIndex = findSmallest(x, k);
        swap(x, k, smallestIndex);
        sort(x, k + 1);
//0: hello, whoa, apple, hola
//1: apple, whoa, hello, hola
//2: apple, hello, whoa, hola
//R2: whoa, apple, hello, hola
    }

    // @source https://stackoverflow.com/questions/5153496
    public static int findSmallest(String[] input, int startingIndex) {
        int currentSmallest = startingIndex;
        for (int i = startingIndex; i < input.length; i += 1) {
            int cmp = input[i].compareTo(input[currentSmallest]);
            if (cmp < 0) {
                currentSmallest = i;
            }
        }
        return currentSmallest;
    }


    public static void swap(String[] input, int a, int b) {
        String temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}