package lec8_lists4.speedtest;

public class SpeedTestAList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        AList L = new AList();
        int i = 0;
        while (i < 100000) {
            L.addLast(i);
            i = i + 1;
        }


        long endTime = System.currentTimeMillis();
        System.out.println("Total runtime: " + (endTime - startTime) + " ms");
    }
}

