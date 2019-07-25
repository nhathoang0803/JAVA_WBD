import java.util.Scanner;

public class Rectangle {
        public int width;
        public int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            int area = this.width * this.height;
            System.out.println("Diện tích HCN là: " + area);
            return area;
        }

        public int getPerimeter() {
            int perimeter = (this.width + this.height) * 2;
            System.out.println("Chu vi HCN là: " + perimeter);
            return perimeter;
        }

        public void display() {
            System.out.println("HCN: có chiều dài là: " + height + ", có chiều rộng là: " + width);

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập chiều dài: ");
            int width = scanner.nextInt();
            System.out.println("Nhập chiều rộng: ");
            int height = scanner.nextInt();

            Rectangle rectangle = new Rectangle(width, height);
            rectangle.display();
            rectangle.getArea();
            rectangle.getPerimeter();
        }
}
