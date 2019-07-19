public class getPrimes {
    public static void isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2) check = false;
        if (n == 2) check = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.print(n +" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        for (int i = 0; i < 100; i++) {
            isPrimeNumber(i);
        }
    }
}
