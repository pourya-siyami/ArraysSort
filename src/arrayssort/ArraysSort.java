package arrayssort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of array elements:");
        n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Please enter numbers: ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("entered array is: " + Arrays.toString(num));

        System.out.println("---------------------------");

        //sort //swap
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int tNum = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tNum;
                    count += 1;
                }
            }
        }
        System.out.println("sorted array is: " + Arrays.toString(num));
        System.out.println("Number of shifts: "+ count);
    }
}
