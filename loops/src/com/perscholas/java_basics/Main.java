package com.perscholas.java_basics;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 1; i++) {
            System.out.println("Outer Loop");
            for (int j = 1; j <= 1; j++) {
            System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }
}

 /*  Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).

  */

/*    Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i = i +1) {
            System.out.println(i);
        }
    }
}


        Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 10;
        }

    }
}


        Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);


    }
}


        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            if (i == 25) {
                i = i + 55;
                continue;
            }
            System.out.println(i);
            i = i + 5;
        }

    }
}


        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i = i + 5) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
    }
}


        Write a program that uses nested for-loops to output the following:
        Week 1:
        Day 1 - Day 5
        Week 2:
        Day 1 - Day 5
public class Main {
    public static void main(String[] args) {

        for (int w = 1; w <= 2; w++) {
            System.out.println("Week" + w);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Day" + i);
            }
        }
    }
}



        Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int q = 11;
        while (i <= 200) {
            System.out.println(i);
            i = i + q;
            if (i == 110) {
                i = i + 1;
                q = 10;
            }
        }

    }
}


        Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
class Main {
    public static void main(String[] args) {

        int i = 1, f = 0, s = 1;
        while (f <= 50) {
            System.out.print(f + ", ");

            int next = f + s;
            f = s;
            s = next;
            i++;
        }
    }
}


        Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 1; i++) {
            System.out.println("Outer Loop");
            for (int j = 1; j <= 1; j++) {
            System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }
}

        */
