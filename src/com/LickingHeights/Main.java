package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        //Pattern1();
        //Pattern2();
        //Pattern3();
        //Pattern4();
        //Pattern5();

//        System.out.println("The sum of the array is " + sum(array));
//        System.out.println("The minimum of the array is " + minimum(array));
        printArray(array);
        //System.out.println("The maximum of the array is " + maximum(array));

        System.out.println("After Bubble Sort");
        printArray(bubbleSort(array));
    }

    public static void Pattern1() {

        for (int times = 0; times < 6; times++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void Pattern2() {

        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns < 8; columns++) {
                System.out.print(times);
            }
            System.out.println();
        }


    }

    public static void Pattern3() {

        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    public static void Pattern4() {

        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns <= times; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern5() {

        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns <= times; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }


    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int minimum(int[] array) {
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minimum < array[i]) {
                array[i] = minimum;
            }

            minimum = array[i];
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maximum > array[i]) {
                array[i] = maximum;
            }

            maximum = array[i];
        }
        return maximum;
    }

    public static int[] bubbleSort(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }


        }


        return array;

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }


}
