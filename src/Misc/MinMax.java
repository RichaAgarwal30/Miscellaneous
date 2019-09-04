package Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        int[] number = {5, 3, 4, 1, 2};

        Arrays.parallelSort(number, 0, 5);

        System.out.println("Modified number[]:" + Arrays.toString(number));

        int min = 0;
        int max = 0;

        for (int i = 0; i < number.length - 1; i++) {

            min = number[i] + min;

        }

        System.out.println("Minimum is : " + min);

        for (int j = 1; j < number.length; j++) {

            max = number[j] + max;

        }

        System.out.println("Maximum is : " + max);

    }

}