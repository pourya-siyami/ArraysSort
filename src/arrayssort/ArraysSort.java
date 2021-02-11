package arrayssort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
    // Return the number of swaps to sort the array
    public int minSwaps(int[] num, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(num, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            if (num[i] != temp[i]) {
                ans++;
                swap(num, i, indexOf(num, temp[i]));
            }
        }
        return ans;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public int indexOf(int[] num, int n) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of array elements:");
        n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Please enter numbers: ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("---------------------------");
        System.out.println("Number of swaps to sort: " + new ArraysSort().minSwaps(num, n));

    }
}