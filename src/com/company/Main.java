package com.company;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);                                                            // . Calling the Scanner class to retrieve the input values.

    public static void main(String[] args) {

        System.out.println("Enter count: ");                                                                            // . Printing the string asking for the count.
        int count = scanner.nextInt();                                                                                  // . Setting the value from input in the count variable.
        scanner.nextLine();                                                                                             // . Enter key.

        int [] a = readIntegers(count);                                                                                 // . Creating a new array (length 5) with the class readIntegers
        System.out.println(Arrays.toString(a));
        System.out.println(findMin(a));
    }

    public static int[] readIntegers(int count){                                                                        // . Creating a method that has one parameter, "count" = the length of the array.

        int[] array = new int[count];                                                                                   // . Creating an array passing count as the length.
        for(int i = 0; i < count ; i++){                                                                                // . For loop statement that goes through the whole array, starting from position 0.
            System.out.println("Insert value for the position: " + i + "\r");                                           // . String that ask the user the input to be inserted in the array.
          while(!scanner.hasNextInt()){                                                                                 // . Creating an Infinite loop using the method hasNextInt() from the class Scanner, to check if the next int is not (thanks to the ! before the method) an int.
              System.out.println("Invalid Value.");                                                                     // . Printing the string "Invalid value".
              scanner.next();                                                                                           // . Waiting for another input
              }                                                                                                         // . The loop is going to break only if integers datatype are inserted from the user.
            array[i] = scanner.nextInt();                                                                               // . Insert in the position i (of the for loop) of the array the value from input.
          }
        return array;                                                                                                   // . Returning the array filled in by the user.
        }


    public static int findMin(int[] array){                                                                             // . Creating a method that find the lower value in the array, needs 1 array as parameter.
        int storage = array[0];                                                                                         // . Creating a variable to store the min value and store the first element of the array, it doesn't matter how low or high is.
        for(int i = 0; i < array.length; i++ ){                                                                         // . For loop statement that goes through the whole array, starting from position 0.
            if(storage > array[i]){                                                                                     // . Every cycle is going to check if the value inside the variable storage is higher than the one in the array in the actual position.
                storage = array[i];                                                                                     // . If yes set the new value inside the storage variable.
            }
        }
        return storage;                                                                                                 // . Returning the min value.
    }



    }




/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name MinElementChallenge.
 */