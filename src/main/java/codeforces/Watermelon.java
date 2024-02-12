package codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);  // Create a Scanner
        int w = scanner.nextInt();  // Read user input

        if (w > 2) {
            if (w % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
