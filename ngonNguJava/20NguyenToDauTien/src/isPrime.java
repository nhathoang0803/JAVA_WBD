public class isPrime {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                //  break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên: ");
        int dem = 0;
        int i = 2;
        while (dem < 20) {
            if (isPrimeNumber(i)) {
                System.out.println((i));
                dem++;
            }
            i++;
        }
    }
}
