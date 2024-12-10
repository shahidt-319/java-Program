import java.util.Scanner;
public class stringManipulation {
        public static String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        public static boolean isPalindrome(String str) {
            String reversed = reverseString(str);
            return str.equalsIgnoreCase(reversed);
        }
        public static int[] countVowelsAndConsonants(String str) {
            int vowels = 0, consonants = 0;
            str = str.toLowerCase();
            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            return new int[]{vowels, consonants};
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            System.out.println("Welcome to the String Manipulation Program!");
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Reverse a string");
                System.out.println("2. Convert to uppercase");
                System.out.println("3. Convert to lowercase");
                System.out.println("4. Check if a string is a palindrome");
                System.out.println("5. Count vowels and consonants");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter a string to reverse: ");
                        String toReverse = scanner.nextLine();
                        System.out.println("Reversed string: " + reverseString(toReverse));
                        break;
                    case 2:
                        System.out.print("Enter a string to convert to uppercase: ");
                        String toUpperCase = scanner.nextLine();
                        System.out.println("Uppercase: " + toUpperCase.toUpperCase());
                        break;
                    case 3:
                        System.out.print("Enter a string to convert to lowercase: ");
                        String toLowerCase = scanner.nextLine();
                        System.out.println("Lowercase: " + toLowerCase.toLowerCase());
                        break;
                    case 4:
                        System.out.print("Enter a string to check if it's a palindrome: ");
                        String palindromeCheck = scanner.nextLine();
                        if (isPalindrome(palindromeCheck)) {
                            System.out.println("The string is a palindrome.");
                        } else {
                            System.out.println("The string is not a palindrome.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter a string to count vowels and consonants: ");
                        String toCount = scanner.nextLine();
                        int[] counts = countVowelsAndConsonants(toCount);
                        System.out.println("Vowels: " + counts[0]);
                        System.out.println("Consonants: " + counts[1]);
                        break;
                    case 6:
                        System.out.println("Exiting the program.");
                        exit = true;
                        break;
                    default: 
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            scanner.close();
        }
    }


