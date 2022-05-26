package coding.challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 배열 integers 초기화
        int[] integers = {323, 2, 3, 123, 45, 6, 788};

        System.out.println("\n\nSort via Radi sort:");
        System.out.println("-----------------------");

        RadixSort.sort(integers, 10);
        System.out.println("Sorted: " + Arrays.toString(integers));
    }
}