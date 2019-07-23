import java.util.Scanner;

public class poolingArray {
    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhập phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        System.out.println("Các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void gopMang(int[] arr1, int n, int[] arr2, int m, int[] arr3, int h) {
        h = n + m;
        for (int i = 0; i < h; i++) {
            if (i < n) {
                arr3[i] = arr1[i];
            } else
                arr3[i] = arr2[i - n];
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng A: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
        nhapMang(A, n);
        System.out.println();
        xuatMang(A, n);
        System.out.println();

        System.out.print("Nhập số lượng phần tử mảng B: ");
        int m = scanner.nextInt();
        int B[] = new int[m];
        nhapMang(B, m);
        System.out.println();
        xuatMang(B, n);

        int h = n + m;
        int C[] = new int[h];
        System.out.println("Gộp mảng A và B thành mảng C:");
        gopMang(A, n, B, m, C, h);
        xuatMang(C, h);

    }
}
