package com.company;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] array = {4, 5, 6, 8, 1, 80};
        float[] arrayFloat = {1.2f, 5.6f, 4.7f};
        double[] arrayDouble = {1.2d, 5.6d, 4.7d};
//  Task - 1
//        add(input.nextInt());
//        add(input.nextInt(), input.nextFloat());
//        add(input.nextFloat(), input.nextInt());

//  Task - 2
//        System.out.println(getInteger(k));
//        System.out.println(getFloat(k));

//  Task - 4
//        print(array);
//        print(arrayFloat);
//        print(arrayDouble);

//  Task - 5
//        System.out.println(search(array, 5,5));

//  Task - 6
//        System.out.println(square(input.nextInt()));

//  Task - 7
//        System.out.println(max(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));

//  Task - 8
//        System.out.println(distance(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));

//  Task - 9
//        fahrenheitCelsius(input.nextFloat(),input.nextInt());

//  Task - 10
//        System.out.println(remainder(input.nextInt()));
    }
/*
Task - 1
Write a function add with these 3 types of overloading.
static void add();
Which prints which method is called and result.
*/
    public static void add(int i) {
        System.out.println("int");
    }

    public static void add(int i, float f){
        System.out.println("int, float");
    }

    public static void add(float f, int i){
        System.out.println("float, int");
    }

/*
Task - 2
Write 2 functions where first returns float second returns int,
and they have the same parameters for input.
*/
    public static int getInteger(int i){
        return i + 5;
    }
    public static float getFloat(int i){
        return (float) i + 5;
    }

/*
Task - 4
Write a method called print(), which takes an array and print its contents in the form of
[a1, a2, ..., an]. Take note that there is no comma after the last element. The method's
signature is as follows:
We need to overload this method for int[ ], float[ ], double[ ] arrays.
*/
    public static void print(int array[]){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }

    public static void print(float array[]){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }

    public static void print(double array[]){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }

/*
Task - 5
5.Write a search function, which
- - get as an argument int[ ] array, (returns the size of array)
public static int search(int[ ] array)
- - get as an argument int[ ] array , also int a, and returns an index of that argument
public static int search(int[ ] array, int a)
- - get as an argument int[ ] array, int argument, int index
returns true if that element is in that place in array,otherwise false
public static boolean search(int[] array, int argument, int index).
*/
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a){
        for(int i = 0; i < array.length; i++){
            if (array[i] == a){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index){
        for (int i = 0; i < array.length; i++){
            if (array[index] == argument){
                return true;
            }
        }
        return false;
    }

/*
Task - 6
Write a square() method, which
- - if get one int parameter returns the square of cirqle
- - if get one float parameter returns the square of square
- - if get 2 parameters returns the square of rectangle
*/
public static float square(int r) {
    final float PI = 3.14f;
    return (float) (PI * Math.pow(r, 2));
}

    public static float square(float a) {
        return a * a;
    }

    public static int square(int a, int b) {
        return a * b;
    }

/*
Task - 7
Write a max() function which
- - max(int a, int b)
- - max(int a, int b, int c)
- - max(int a , int b, int c, int d)
*/
    public static int max(int a, int b) {
    return (a > b) ? a : b;
}

    public static int max(int a, int b, int c) {
        return max(a, b) > c ? max(a, b) : c;
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, b, c) > d ? max(a, b, c) : d;
    }

/*
Task - 8
Write a distance() function which
- - return distance from (0.0 , 0.0) to (a)
distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
distance(int, int)
- - return the distance from a to be, if method distance get 4 int parameters.
*/
public static double distance(int x, int y) {
    return Math.sqrt((x * x) + (y * y));
}

    public static double distance(int x1, int y1, int x2, int y2) {
        if (x1 * x2 > 0 && y1 * y2 > 0) {
            int x = Math.abs((x2 - x1));
            int y = Math.abs((y2 - y1));
            return distance(x, y);
        }
        if (x1 * x2 < 0 && y1 * y2 > 0) {
            int x = Math.abs(x1) + Math.abs(x2);
            int y = Math.abs(y2 - y1);
            return distance(x, y);
        }
        if (x1 * x2 > 0 && y1 * y2 < 0) {
            int x = Math.abs(x2 - x1);
            int y = Math.abs(y1) + Math.abs(y2);
            return distance(x, y);
        }
        if (x1 * x2 < 0 && y1 * y2 < 0) {
            int x = Math.abs(x1) + Math.abs(x2);
            int y = Math.abs(y1) + Math.abs(y2);
            return distance(x, y);
        }
        return 0;
    }

/*
Task - 9
Write a fahrenheitCelsius() function which
- - prints fahrenheit value when pass (float celsius, int choice), where choice is the type of
fahrenheit`
1 , print fahrenheit as int value
2 , print fare fahrenheit asa double value
3 , if pass another value print illegal argument
- - prints celsius when pass (int choice, float fahrenheit)
Example` fahrenheitCelsius(32.0, 1);
Output` 32 fahrenheit is 0 celsius ;
*/
    public static void fahrenheitCelsius(float fahrenheitCe, int choice) {
        switch (choice) {
            case 1:
                System.out.println((int) (fahrenheitCe - 32) * 1.8);
                break;
            case 2:
                System.out.println(fahrenheitCe - 32 * 1.8);
                break;
            default:
                System.out.println("Illegal argument.");
                break;
        }
    }
    public static void fahrenheitCelsius(int choice, float celsius) {
        switch (choice) {
            case 1:
                System.out.println((int) (celsius / 1.8 + 32));
                break;
            case 2:
                System.out.println(celsius / 1.8 + 32);
                break;
            default:
                System.out.println("Illegal argument.");
                break;
        }

    }
/*
Task - 10
Write a function` remainder() which
- - when pass one int value, return sum of digits for that value remainder(int)
- - when pass one int value and one natural int, return reminder from sum of digits divided to
second parameter(reminder(int 331, int 5) {
return (3 + 3 + 1) % 5.
*/
    public static int remainder(int number1) {
        int digit=0 ;
        int count=0;
        int number=number1;
        do{
            count++;
            number1=number1/10;
        }
        while (number1>0);
        for (int i = 0; i < count; i++) {
            digit=digit+number%10;
            number = number / 10;
        }
        return digit;
    }
        public static int remainder(int number1, int number2) {
            return remainder(5)%number2;
        }
    }


