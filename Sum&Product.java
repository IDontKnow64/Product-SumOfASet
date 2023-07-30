/*
Name: Tommy
Date: 19/10/2022
This program takes an input of an array size and inputs that are equal to the array size
and outputs the array, its sum, and its product
 */

import java.util.Scanner;       //imports the Scanner package

public class ICS3U_Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //creates a scanner for input
        int sum = 0;                        //sets the sum to 0 (n+0=n)
        int product = 1;                    //sets the product to 1 (n*1=n)
        int size;       //declares the size

        do {        //runs once
            System.out.println("Please input your desired size of array that is greater than 5: "); //asks user for the input
            size = scanner.nextInt();       //the input, array size
        }while(size<6);     //checks if size is less than 6; if less, then it reruns; if not, it continues

        int[] array = new int[size];        //initializes the array of the given size

        System.out.println("Please input " + size + " numbers between 2 and 30: ");   //asks user for inputs to fill the array

        for (int i = 0; i<size; i++)        //for loop to fill the array
        {
            do {        //runs once
                array[i] = scanner.nextInt();   //the input, the elements of the array
            }while(array[i]<2 || array[i]>30);
            //checks if element is less than 2 or greater than 30; if true, then it reruns; if not, it continues
        }

        System.out.print("Output: Array elements are ");    //outputs a message

        for (int i = 0; i<size; i++)        //for loop to output the array
        {
            System.out.print(array[i] + " ");   //outputs each element of the array
        }

        for (int i = 0; i<size; i++)    //for loop to update the sum and product for each element
        {
            sum = sum + array[i];       //adds the element to the sum
            product = product * array[i];       //multiplies the element to the product
        }
        System.out.println("\n\t\tSum = " + sum + "\n\t\tProduct = " + product );     //outputs the sum and the product
    }
}
