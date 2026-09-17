package lec9_inheritance1;

public class WordUtils {
    public static String longest(List61B<String> list) {
        int maxDex = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxDex = i;
            }
        }

        return list.get(maxDex);
    }

    void main() {
        SLList<String> someWords = new SLList<>();
        someWords.addLast("hi");
        someWords.addLast("aiouwhelfiauhweliuhf");
        //IO.println(longest(someWords));
        someWords.print();

    }
}
