import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is DevOps lab experiment Github part-2.");

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the function number to execute (or enter 0 to exit):");
            System.out.println("1. Sort Array");
            System.out.println("2. Add Numbers");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Find Largest Number");
            System.out.println("5. Create Pattern");
            System.out.println("6. Subtract Numbers");
            System.out.println("7. Sum of Array");
            System.out.println("8. Prime Numbers");
            System.out.println("9. Divide Numbers");
            System.out.println("10. Multiply Numbers");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                case 1:
                    // Call sorting function
                    int[] testArray = {4, 2, 7, 1, 9};
                    sortarraybubblebyharsh(testArray);
                    System.out.print("Sorted Array: ");
                    for (int num : testArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    // Call addition function
                    add(args);
                    break;
                case 3:
                    // Call palindrome check function
                    int number = 121;
                    System.out.println(number + " is palindrome: " + isPalindrome(number));
                    break;
                case 4:
                    // Call largest number function
                    int[] numbers = {10, 5, 20, 8, 15};
                    System.out.println("Largest number in the array is: " + largest(numbers));
                    break;
                case 5:
                    // Call pattern printing function
                    createPattern(5);
                    break;
                case 6:
                    // Call subtraction function
                    subtract(10, 5);
                    break;
                case 7:
                    // Call sum function
                    int[] sumArray = {1, 2, 3, 4, 5};
                    System.out.println("Sum of elements in the array is: " + sum(sumArray));
                    break;
                case 8:
                    // Call prime number function
                    PrimeNumbers primeNumbers = new PrimeNumbers();
                    primeNumbers.printPrimeNumbers(50);
                    break;
                case 9:
                    // Call division function
                    double dividend = 10;
                    double divisor = 2;
                    System.out.println("Division result: " + divide(dividend, divisor));
                    break;
                case 10:
                    // Call multiplication function
                    int product = multiplyafreen(5, 7);
                    System.out.println("Product of numbers: " + product);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // Function to sort an array using bubble sort by Harsh Ranjan
    public static void sortarraybubblebyharsh(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Function to add two numbers by Yashvir Singh
    public static void add(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function to check if a number is palindrome by Anushka Mediratta
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    // Function to find the largest number in an array by Abhinav Kumar
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to create a pattern of asterisks by Harsh Verma
    public static void createPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to subtract two numbers by Girish
    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println("The result of subtraction is: " + result);
    }

    // Function to find the sum of elements in an array by Abhijeet Nautiyal
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Class to find prime numbers by Gitika Thakur
    public static class PrimeNumbers {
        public void printPrimeNumbers(int limit) {
            System.out.println("Prime numbers up to " + limit + ":");
            for (int num = 2; num <= limit; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        public boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // Function to divide two numbers by Srajeta Gupta
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }

    // Function to multiply two numbers by Afreen
    public static int multiplyafreen(int num1, int num2) {
        return num1 * num2;
    }
}

#Nancy contribution
def print_numbers(n):
    if n > 0:
        print_numbers(n - 1)  # Recursively call with n-1
        print(n)  # Print the current number

# Example usage:
N = 10
print_numbers(N)
