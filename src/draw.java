import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        int choice= -1;
        Scanner input=new Scanner(System.in);

        while ( choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at bottom-left)");
            System.out.println("3. Print the square triangle (The corner is square at top-left)");
            System.out.println("4. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 20; j++) {
                            System.out.print("-");
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at bottom-left)");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < i; j++) {
                            System.out.print("-");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Print the square triangle (The corner is square at top-left)");
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("-");
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Print isosceles triangle");
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10 - i; j++) System.out.print(" ");
                        for (int k = 1; k <= i; k++) System.out.print("- ");
                        System.out.println(" ");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

