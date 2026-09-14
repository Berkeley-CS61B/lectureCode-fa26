package lec8_lists4.speedtest;

public class SpeedTestSLList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        SLList<Integer> L = new SLList<>();
        int i = 0;
        while (i < 100000) {
            L.addFirst(i);
            i = i + 1;
        }


        long endTime = System.currentTimeMillis();
        System.out.println("Total runtime: " + (endTime - startTime) + " ms");
    }
}

