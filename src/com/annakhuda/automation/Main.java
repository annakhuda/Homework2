package com.annakhuda.automation;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Main {
    public static void main(String[] args) {
        System.out.println("The result of the first task is: " + (74 + 36));
        System.out.println("\nSecond task, a variant: " + (-5 + 8 * 6));
        System.out.println("Second task, b variant: " + ((55 + 9) % 9));
        System.out.println("Second task, c variant: " + (20 + -3 * 5 / 8));
        System.out.println("Second task d variant: " + (5 + 15 / 3 * 2 - 8 % 3));
        System.out.println("\n125 + 24 = " + sum(125, 24));
        System.out.println("125 - 24 = " + subtract(125, 24));
        System.out.println("125 x 24 = " + multiply(125, 24));
        System.out.println("125 / 24 = " + divide(125, 24));
        System.out.println("125 mod 24 = " + mod(125, 24));
        int[] arr = {5, 6, 7, 12, -5, 32, 43};
        int[] duplicatesArr = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        System.out.println("\nThe sum of the elements of array is: " + arraySum(arr));
        System.out.println("\nDuplicates of the array: " + Arrays.toString(duplicates(duplicatesArr)));
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
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] duplicates(int[] arr) {
        int[] duplFull = new int[10];
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    duplFull[z] = arr[j];
                    z++;
                }
            }
        }
        int[] dupl = new int[z];
        for (int i = 0; i < dupl.length; i++) {
            dupl[i] = duplFull[i];
        }
        return dupl;
    }
}
