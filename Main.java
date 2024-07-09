import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) Write a program to find all of the longest word in a given dictionary.

//        String[] dictionary = {"cat", "dog", "is", "red", "am"};
//
//        ArrayList<String> longest = new ArrayList<>();
//        int max = 0;
//        for (String word : dictionary) {
//            if (word.length() > max) {
//                longest.clear();
//                max = word.length();
//                longest.add(word);
//            } else if (word.length() == max) {
//                longest.add(word);
//            }
//        }
//        System.out.println(longest);

        //Q2) Write a program that displays the number of occurrences of an element in the array.

//        int[] num = {1, 1, 1, 3, 3, 5};
//        System.out.println("Please enter number of an element in the array want to check : ");
//        int n = sc.nextInt();
//        int[] check = new int[n];
//        System.out.println("please enter your number to check");
//        for (int i = 0; i < n; i++) {
//            check[i] = sc.nextInt();
//        }
//        for (int number : check) {
//            int count = 0;
//            for (int element : num) {
//                if (element == number) {
//                    count++;
//
//                }
//            }
//            System.out.println(number + " occurs " + count + " times");
//        }

        //Q3) .Write a program to find the k largest elements in a given array. Elements in the array can be in
        //any order.

//        int[] number = {1, 4, 17, 7, 25, 3, 100};
//        System.out.println("Please enter K largest number do you want me to founds :");
//        int k = sc.nextInt();
//
//        int[] largestElements = findKLargestElements(number, k);
//
//        System.out.println(k + " largest elements of the said array are:");
//        for (int element : largestElements) {
//            System.out.print(element + " ");
//        }


        //Q4) Create a method to reverse an array of integers. Implement the method without creating a new
        //array.

//        int[] array = {5,4,3,2,1};
//        System.out.println("Original Array :" + Arrays.toString(array));
//        reversArray(array);
//        System.out.println("Reversed Array : " + Arrays.toString(array));

        //Q5) Write a menu driven Java program with following option:

//        int[] array = null;
//        boolean stop = false;
//
//        while (!stop) {
//            System.out.println("Menu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    array = acceptElements(sc);
//                    break;
//                case 2:
//                    displayElements(array);
//                    break;
//                case 3:
//                    searchElement(sc, array);
//                    break;
//                case 4:
//                    sortArray(array);
//                    break;
//                case 5:
//                    stop = true;
//                    System.out.println("Exiting program...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }

        //Q6 Create a method that generates a random number within a given range. Allow the user to
        //specify the range and call the method to display random numbers.
        //Hint: use Random class

//        System.out.print("Enter the minimum value of the range: ");
//        int min = sc.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = sc.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = sc.nextInt();
//
//        System.out.println("Random numbers within the specified range:");
//        generateRandomNumbers(min, max, count);


        //Q7) Write a program that checks the strength of a password. Create a method that evaluates a
        //password based on criteria like length, inclusion of special characters, and uppercase/lowercase
        //letters.
        //- We have three methods: checkLength, checkSpecialCharacters, and
        //checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
        //- The totalScore is calculated by adding the scores from these methods.
        //- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
        //based on the totalScore.
        //- The criteria for scoring:
        //• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
        //(3 points).
        //• Special characters: Absence (0 points), Presence (2 points).
        //• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
        //points).

//        System.out.print("Enter a password: ");
//        String password = sc.nextLine();
//
//        int totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//
//        if (totalScore >= 8) {
//            System.out.println("Password is strong.");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }


        //Q8) Create a method that generates the Fibonacci sequence up to a specified number of terms.
        //Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
        //and each subsequent number in the sequence is the sum of the two preceding ones.

//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int terms = sc.nextInt();
//
//        System.out.println("Fibonacci sequence with " + terms + " terms:");
//        generateFibonacci(terms);

    }







    // Q3) تبع سؤال ثلاثه الميثود
    public static int[] findKLargestElements(int[] array, int k) {
        Arrays.sort(array);
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    //Q4
    public static void reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }


    //Q5
    public static int[] acceptElements(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void displayElements(int[] array) {
        if (array == null) {
            System.out.println("Array is empty. Please enter the elements first.");
        } else {
            System.out.println("Elements of the array: " + Arrays.toString(array));
        }
    }

    public static void searchElement(Scanner sc, int[] array) {
        if (array == null) {
            System.out.println("Array is empty. Please enter the elements first.");
        } else {
            System.out.print("Enter the element to search: ");
            int element = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    System.out.println("Element " + element + " found at index " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Element " + element + " not found in the array.");
            }
        }
    }

    public static void sortArray(int[] array) {
        if (array == null) {
            System.out.println("Array is empty. Please enter the elements first.");
        } else {
            Arrays.sort(array);
            System.out.println("Array sorted: " + Arrays.toString(array));
        }
    }

    //Q6
    public static void generateRandomNumbers(int min, int max, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.print(randomNumber + " ");
        }
        System.out.println();
    }

    //Q7
    public static int checkLength(String password) {
        int length = password.length();
        if (length >= 8) {
            return 3;
        } else if (length >= 6) {
            return 2;
        } else {
            return 0;
        }
    }

    // Method to check for special characters in the password
    public static int checkSpecialCharacters(String password) {
        if (password.matches(".*[!@#$%^&*()-+].*")) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        if (hasUpperCase && hasLowerCase) {
            return 3;
        } else {
            return 0;
        }
    }


    //Q8
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please number of terms must be greater than 0.");
            return;
        }
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}
