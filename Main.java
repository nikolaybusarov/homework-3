package com.company;

import java.time.Month;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int LENGTH = 5;
    public static final int WIDTH = 5;
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        System.out.println((numberOfDaysInAmonth(Month.FEBRUARY, 0)));
        int array [][] = createArray();
        int arrayOne [] = createArrayOne();
        int arrayTwo [] = createArrayTwo();
        System.out.println(Arrays.toString(differenceMinMaxArrayElement(arrayOne)));
        arrayComparison(arrayOne,arrayTwo);
        int arrayThree [] = new int[]{1, 2, 5, 7, 9, 0, 4, 6, 8};
        System.out.println(searchForAmissingNumber(arrayThree));
        System.out.println(minimumElementOfAtwoDimensionalArray(array));
        twoDimensionalArray(swapMinMaxArrayElements(array));
        twoDimensionalArray(replaceOddElementsWithThePreviousOne(array));

    }

    public static int numberOfDaysInAmonth (Month name, int days) {
        switch (name) {
            case JANUARY:
                days = 31;
                break;
            case FEBRUARY:
                days = 28;
                break;
            case MARCH:
                days = 30;
                break;
            case APRIL:
                days = 30;
                break;
            case MAY:
                days = 31;
                break;
            case JUNE:
                days = 30;
                break;
            case JULY:
                days = 31;
                break;
            case AUGUST:
                days = 31;
                break;
            case SEPTEMBER:
                days = 30;
                break;
            case OCTOBER:
                days = 31;
                break;
            case NOVEMBER:
                days = 30;
                break;
            case DECEMBER:
                days = 31;
                break;
            default:
        }
        return days;
    }

    public static int[][] createArray() {
        int array [][] = new int[LENGTH][WIDTH];
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                array[i][j] = RANDOM.nextInt(20) ;
            }
        }
        return array;
    }

    public static int[] createArrayTwo() {
        int arrayTwo [] = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            arrayTwo[i] = RANDOM.nextInt(20) ;
        }
        return arrayTwo;
    }

    public static void twoDimensionalArray (int array [][]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[] differenceMinMaxArrayElement (int arrayOne []) {
        int max = arrayOne[0];
        int min = arrayOne[0];
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > max) {
                max = arrayOne[i];
            }
            if (arrayOne[i] < min) {
                min = arrayOne[i];
            }
        }

        System.out.println("Разница : " + (max - min));
        return arrayOne;
    }

    public static boolean arrayComparison (int arrayOne [], int arrayTwo []) {
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }

    public static int searchForAmissingNumber (int arrayThree []) {
        int sum = 0;
        for (int i = 0; i < arrayThree.length; i++) {
            sum += arrayThree[i];
        }
        return ((arrayThree.length + 1) * arrayThree.length / 2) - sum;
    }

    public static int minimumElementOfAtwoDimensionalArray (int array [][] ) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int[][] swapMinMaxArrayElements(int array [][] ) {
        int min = 0;
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        int minI = 0;
        int minJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        array[maxI][maxJ] = min;
        array[minI][minJ] = max;
        return array;
    }

    public static int[][] replaceOddElementsWithThePreviousOne (int array [][] ) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][0] % 2 != 0) {
                    array[i][j] = 0;
                } else if (array[i][j] % 2 != 0) {
                    array[i][j] = array[i][j - 1];
                }
            }
        }

        return array;
    }
}
