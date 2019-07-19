import java.util.Scanner;

public class types {
    public static void drawRect() {
        System.out.println("Vẽ hình chữ nhật");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle() {
        System.out.println("Vẽ hình tam giác vuông");
        int number = 1;
        while (number <= 5) {

            for (int i = 0; i < number; i++) {
                System.out.print("* ");
            }
            System.out.println();
            number++;
        }
    }

    /*
    HEIGHT    4
                line = space + character;
    *           1       3       1     space = HEIGHT - line
   ***          2       2       3       character = 2*line -1
  *****         3       1       5
 *******        4       0       7
    */

    public static void drawIsoscelesTriangle() {
        final int HEIGHT = 4;
        String result = "";
        int line = 1;
        while (line <= HEIGHT) {

        }
    }

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật ");
            System.out.println("2. Vẽ hình tam giác");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drawRect();
                    break;
                case 2:
                    drawSquareTriangle();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Chọn lại");

            }
        }

    }
}
