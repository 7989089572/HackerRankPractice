#Added HackerRank practice problems: if-else, input-output, sum, and multiplication table

import java.util.Scanner;

public class HackerRankPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Simple If-Else
        System.out.println("Enter a number for If-Else check:");
        int n = sc.nextInt();
        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        // 2. Stdin and Stdout II
        System.out.println("\nEnter an int, double and string:");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); // clear the newline
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // 3. Sum of two numbers
        System.out.println("\nEnter two numbers to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));

        // 4. Multiplication Table
        System.out.println("\nEnter number for multiplication table:");
        int num = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(num + " x " + j + " = " + (num * j));
        }
    }
}
