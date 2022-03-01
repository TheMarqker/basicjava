package com.teksystems;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 - 7 ");
        int week = scan.nextInt();

        String weekString;
        switch (week) {
            case 1:  weekString = "Sunday";
                break;
            case 2:  weekString = "Monday";
                break;
            case 3:  weekString = "Tuesday";
                break;
            case 4:  weekString = "Wednesday";
                break;
            case 5:  weekString = "Thursday";
                break;
            case 6:  weekString = "Friday";
                break;
            case 7:  weekString = "Saturday";
                break;
            default: weekString = "Out of range";
                break;
        }
        System.out.println(weekString);
    }
}

   /*  Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the
        corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Don’t forget to
        include “break” statements in each of your cases. */

   /* Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out
   “Less than 10” if x is less than 10. Change x to equal 15 and notice the result (console should not display anything).

public static void main(String[] args) {
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

        Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is
        greater than 10. Change x to 15 and notice the result.


        public static void main(String[] args) {
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10) {
                    System.out.println("Greater than 10");
                }
            }
        }

        Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an “if-else-if” statement
         that prints out “Less than 10” if x is less than 10, “Between 10 and 20” if x is greater than 10 but less than
          20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.

public static void main(String[] args) {
        int x = 9;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x <= 20) {
                System.out.println("Between 10 amd 20");
        } else if (x > 10 && x < 20) {
                    System.out.println("Greater than 10");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
                }
            }

        Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that
         prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if between 10 and
         20 (including equal to 10 or 20). Change x to 5 and notice the result.

   public static void main(String[] args) {
                    int x = 15;

                    if (x < 10 && x > 20) {
                        System.out.println("Out of range");
                    } else if (x >= 10 && x <= 20) {
                        System.out.println("In range");
                    }
                }
            }

        Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:

        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: <60

        Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score
        out of range.” if the score is less than 0 or greater than 100.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Grades");
        int x = scan.nextInt();

        if (x >= 90 && x <= 100)
            System.out.println("A: 90-100");
         else if (x >= 80 && x <= 89)
            System.out.println("B: 80-89");
         else if (x >= 70 && x <= 79)
            System.out.println("C: 70-79");
         else if (x >= 60 && x <= 69)
            System.out.println("D: 60-69");
         else if (x >= 0 && x <= 59)
            System.out.println("F: <59");
       else System.out.println("Score out of range.");
      }
    }

        Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the
        corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Don’t forget to
        include “break” statements in each of your cases.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 - 7 ");
        int week = scan.nextInt();

        String weekString;
        switch (week) {
            case 1:  weekString = "Sunday";
                break;
            case 2:  weekString = "Monday";
                break;
            case 3:  weekString = "Tuesday";
                break;
            case 4:  weekString = "Wednesday";
                break;
            case 5:  weekString = "Thursday";
                break;
            case 6:  weekString = "Friday";
                break;
            case 7:  weekString = "Saturday";
                break;
            default: weekString = "Out of range";
                break;
        }
        System.out.println(weekString);
    }
}
*/
