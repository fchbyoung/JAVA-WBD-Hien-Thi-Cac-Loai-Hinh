import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("You choice? :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printTheRectangle();
                    break;
                case 2:
                    printTheSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not Found!");
                    break;
            }
        }

    }

    public static void printTheRectangle() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public static void printTheSquareTriangle() {
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public static void printIsoscelesTriangle() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
