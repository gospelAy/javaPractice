package Chapter4;

import java.util.Scanner;

public class multiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = 1; i <=12 ; i++) {
            System.out.println(number + " times " + i + " is " + (number * i));
        }
    }
}
