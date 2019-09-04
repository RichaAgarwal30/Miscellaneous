package Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {

        int[] arr = {1, -1, 1, -1, 0};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                negative++;
            }
            if (arr[i] == 0) {

                zero++;
            }
            if (arr[i] > 0) {

                positive++;
            }

        }
        float arrLength = arr.length;

        System.out.printf("Output for negative is: %6f\n", negative / arrLength);
        System.out.printf("Output for positive is: %6f\n", positive / arrLength);
        System.out.printf("Output for zero is: %6f\n", zero / arrLength);


    }
}