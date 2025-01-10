// TO-DO:
// -allow numbers to be entered in text form e.g. five

import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 0;
        boolean correctInput;

        do {
            correctInput = false;
            try {
                System.out.print("Enter X:");
                x = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctInput);

        do {
            correctInput = false;
            try {
                System.out.print("Enter Y:");
                y = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer.");
            } finally {
                scanner.nextLine();
            }
        } while (!correctInput);

        System.out.print("Enter operation:");
        String op = scanner.nextLine();

        switch (op) {
            case "plus":
            case "+":
                System.out.println(x + y);
                break;
            case "minus":
            case "-":
                System.out.println(x - y);
                break;
            case "multiply":
            case "*":
                System.out.println(x * y);
                break;
            case "divide":
            case "/":
                if (y == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.println(x / y);
                }
                break;
            default:
                System.out.println("Command not found.");
        }

    }
}