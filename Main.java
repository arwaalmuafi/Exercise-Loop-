import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       /*
       1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that number.
If the number is a multiple of 5, you need to print "Buzz" instead of that number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
        */

//                for (int i = 1; i <= 100; i++) {
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        System.out.println("FizzBuzz");
//                    } else if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else System.out.println(i);
//                }


        /*2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT
         */


//        System.out.print("please enter your sentence ");
//        String word = input.nextLine();
//
//        StringBuilder reversed = new StringBuilder();
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversed.append(word.charAt(i));
//        }
//
//        System.out.println("the Reverse string is: " + reversed);

        /*
        3.Write a program to find the factorial value of any number entered through the keyboard.
         */

//        System.out.print("please Enter a number to find its factorial: ");
//        int number = input.nextInt();
//
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial = factorial * i;
//            System.out.println("Factorial of the number " + number + " is " + factorial);
      //  }

        /*4.Two numbers are entered through the keyboard. Write a program to find the value of one
         number raised to the power of another. (Do not use Java built-in method)
         */
//        System.out.print("Enter the first number: ");
//        int number = input.nextInt();
//        System.out.print("Enter the power: ");
//        int power = input.nextInt();
//
//        int result = 1;
//
//        if (power == 0) {
//            result = 1;
//        } else {
//            //
//            for (int i = 1; i <= power; i++) {
//                result = result * number;
//            }
//        }
//            System.out.println("result= "+ result);


        

        /*5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers
         */
//        int number;
//        int oddSum=0;
//        int evenSum=0;
//
//        do{
//            System.out.println("please enter a number or 0 to execute; ");
//            number =input.nextInt();
//
//            if (number %2 == 0) {
//
//                evenSum = evenSum + number;
//            }else oddSum = oddSum + number;
//        }while (number != 0);

//        System.out.println("the even number sum is; "+ evenSum);
//        System.out.println("the odd number sum is: "+oddSum);

        /*
        6.Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
         */

//        System.out.print("please enter a positive number: ");
//        int number = input.nextInt();
//        boolean isPrime = true;
//
//        if (number <= 1) {
//            isPrime = false;
//        }
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//            }
//        }
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");}



        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4).
         Then use another for loop to print the days (Days 1 -7) for each week.
         */
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//
//            for (int day = 1; day <= 7; day++) {
//                System.out.println(" Day" + day);
//            }
//            System.out.println();
//        }

        /*
        8.Write a program that's check if the word is a
        palindrome or not. hint: A string is said to be a palindrome
        if it is the same if we start reading it from left to right or right to left.
         */
//        System.out.print("please Enter a word: ");
//        String word = input.nextLine();
//
//        boolean palindrome = true;
//        int length = word.length();
//
//
//        for (int i = 0; i < length / 2; i++) {
//            if (word.charAt(i) != word.charAt(length - 1 - i)) {
//                palindrome = false;
//                break;
//            }
//        }
//
//        if (palindrome) {
//            System.out.println(word + " is a palindrome.");
//        } else {
//            System.out.println(word + " is not a palindrome.");
//        }





    }
}
