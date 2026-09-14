package lec8_lists4.speedtest;

public class SpeedTestAListTable {

    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-15s %-15s\n", "N", "Time (ms)");

        int currentN = 10_000;

        while (true) {
            long timeForCurrentN = measureAndPrintForN(currentN);

            if (timeForCurrentN > 5000) {
                break; // Stop if the test took more than 5000 ms
            }

            currentN *= 10; // Increase N by a factor of 10
        }
    }

    /**
     * Creates an SLList, inserts N items, prints out the time taken,
     * and returns the elapsed time in milliseconds.
     */
    private static long measureAndPrintForN(int N) {
        AList L = new AList();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            L.addLast(i);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.printf("%-15d %-15d\n", N, totalTime);
        return totalTime;
    }
}
