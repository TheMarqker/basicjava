package com.teksystems;

public class Main {

    private static final double SALES_TAX = 0.7;

    public static void main(String[] args) {
        double coffee = 1.00;
        double tea = 2.26;
        double biscuit = 3.11;

        double subTotal = coffee*3 + tea*4 + biscuit*2;
        double totalSale = subTotal / SALES_TAX;

        System.out.printf("%.2f",totalSale);
    }
}

/* Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.

public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = x + y;
        System.out.println(z);

 Write a program that declares 2 double variables, assigns a number to each, and adds them together.
 Assign the sum to a variable. Print out the result.

public static void main(String[] args) {
        double x = 10.2;
        double y = 12.2;
        double z = x + y;
        System.out.println(z);

 Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
 Assign the sum to a variable. Print out the result. What variable type must the sum be?

public static void main(String[] args) {
        double x = 10.2;
        int y = 12;
        double z = x + y;
        System.out.println(z);

Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
 Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
 The larger number that becomes a decimal needs to be changed from integer to double and also the result.

public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z = x / y;
        System.out.println(z);

Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
You get an error in the result variable.

public static void main(String[] args) {
        double x = 10.5;
        double y = 1.5;
        double z = x / y;
        System.out.println(z);

Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.

public static void main(String[] args) {
        int x = 5;
        int y = 6;
        double q = y/x;

        System.out.println(q);
        q =(double)y/x;
        System.out.println(q);




        Write a program that declares a named constant and uses it in a calculation. Print the result.

public static void main(String[] args) {
int cat = 5;
System.out.println(cat);

        Write a program where you create 3 variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
        Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product,
        4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal.
         Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
         Be sure to format the results to 2 decimal places.

 private static final double SALES_TAX = 0.7;

    public static void main(String[] args) {
        double coffee = 1.00;
        double tea = 2.26;
        double biscuit = 3.11;

        double subTotal = coffee*3 + tea*4 + biscuit*2;
        double totalSale = subTotal / SALES_TAX;

        System.out.printf("%.2f",totalSale);

*/
