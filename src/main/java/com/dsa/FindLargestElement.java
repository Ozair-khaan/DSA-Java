package com.dsa;

public class FindLargestElement {
    public static int findLargestElement(int[] arr) {
        int largest = arr[0];
        /*int smallest;
        int temp;*/
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        int largestElement = findLargestElement(arr);
        System.out.println(largestElement);
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
}
