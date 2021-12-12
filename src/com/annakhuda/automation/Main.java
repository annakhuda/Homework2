package com.annakhuda.automation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("The result of the first task is: " + (74 + 36));

        // Task 2
        System.out.println("\nSecond task, a variant: " + (-5 + 8 * 6));
        System.out.println("Second task, b variant: " + ((55 + 9) % 9));
        System.out.println("Second task, c variant: " + (20 + -3 * 5 / 8));
        System.out.println("Second task d variant: " + (5 + 15 / 3 * 2 - 8 % 3));

        // Task 3
        int firstNumber = 125;
        int secondNumber = 24;
        System.out.println("\n125 + 24 = " + sum(firstNumber, secondNumber));
        System.out.println("125 - 24 = " + subtract(firstNumber, secondNumber));
        System.out.println("125 x 24 = " + multiply(firstNumber, secondNumber));
        System.out.println("125 / 24 = " + divide(firstNumber, secondNumber));
        System.out.println("125 mod 24 = " + mod(firstNumber, secondNumber));

        // Task 4
        int[] arr = {5, 6, 7, 12, -5, 32, 43};
        System.out.println("\nThe sum of the elements of array is: " + arraySum(arr));

        // Task 5
        int[] arrayWithDuplicates = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        System.out.println("\nDuplicates of the array: " + Arrays.toString(findDuplicates(arrayWithDuplicates)));

    }

    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static int mod(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int[] findDuplicates(int[] arr) {
        int[] duplicatesBuffer = new int[arr.length];
        int duplicatesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    duplicatesBuffer[duplicatesCount] = arr[j];
                    duplicatesCount++;
                }
            }
        }
        int[] duplicates = new int[duplicatesCount];
        for (int i = 0; i < duplicates.length; i++) {
            duplicates[i] = duplicatesBuffer[i];
        }
        return duplicates;
    }
}
