import java.util.Scanner;

public class quadraticEquation {
    private int a, b, c;

    public quadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        double delta = b * b - (4 * a * c);
        //  System.out.println("delta= " + delta);
        return delta;
    }

    public double getRoot() {
        double r = -b / (2 * a);
        System.out.println(r);
        return r;
    }

    public double getRoot1() {
        double delta = b * b - (4 * a * c);
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println(r1);
        return r1;
    }

    public double getRoot2() {
        double delta = b * b - (4 * a * c);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(r2);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        quadraticEquation cbh = new quadraticEquation(a, b, c);

        if (cbh.getDelta() < 0) {
            System.out.println("pt vô nghiệm");
        } else if (cbh.getDelta() == 0) {
            System.out.println("pt có nghiệm kép: " + cbh.getRoot());
        } else if (cbh.getDelta() > 0) {
            System.out.println("pt có 2 nghiệm phân biệt x1= " + cbh.getRoot1() + " và x2= " + cbh.getRoot2());
        }
    }
}
