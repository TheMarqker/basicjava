package com.perscholas.java_basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Main {

public static void main(String[] args) {
       Object[] len = {1, "meow","cat","kit", 2.8d};
            System.out.println(Arrays.toString(len));
    }
}



/*    Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
public static void main(String[] args) {
        int[] len = {1, 2, 3};
        for (int i = 0; i < len.length; i++) {
            System.out.println(len[i]);
        }
    }
}


        Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    public static void main(String[] args) {
        int[] len = {13, 5, 7, 68, 2};
            System.out.println(len[2]);
        }
    }


        Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
        Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
         String[] len = {"red", "green", "blue", "yellow"};
            System.out.println(len.length);

        String[] x = len.clone();
            System.out.println(Arrays.toString(x));
        }
    }


        Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
         Now try to assign a value to the array index 5. You should get the same type of exception.
        int[] len = {1,2,3,4,5};

            System.out.println(len.length);
        len[4] = 700;  // print value to index
        System.out.println(len[4]); //index 5
        System.out.println(len[len.length-1]); //last
        System.out.println(len[0]); //first


        Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
int[] len = {1, 2, 3, 4, 5};

        for (int i = 0; i < len.length; i++) {
            System.out.println(len[i]);
        }


        Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
        int[] len = {1, 2, 3, 4, 5};

        for (int i = 0; i < len.length; i++) {
            System.out.println(len[i] * 2);
        }


        Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
        int[] len = {1, 2, 3, 4, 5};

        for (int i = 0; i < len.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(len[i]);
        }


        Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
        String[] len = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < len.length; i++) {
            if (i == 0) {
                System.out.println(len[2]);
                continue;
            }
            if(i == 2) {
                System.out.println(len[0]);
                continue;
            }
            System.out.println(len[i]);
        }


        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array.
        The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13
        int[] len = {4, 2, 9, 13, 1, 0};
        Arrays.sort(len); //sort array

        for (int i = 0; i < len.length; i++) {

            System.out.println("Array sorted " + len[i]);
        }
            System.out.println("Array low " +len[0]); //lowest
            System.out.println("Array high " +len[len.length - 1]); //highest


        Create an array that includes an integer, 3 strings, and 1 double. Print the array.
           Object[] len = {1, "meow","cat","kit", 2.8d};
            System.out.println(Arrays.toString(len));
    }
}

 */