package Week1day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of the 5 numbers is: " + sum);
        scanner.close();
    }
}




