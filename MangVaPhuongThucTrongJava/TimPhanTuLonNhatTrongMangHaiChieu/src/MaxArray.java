public class MaxArray {
    public static int findMaxElementInMultiArr(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("pt lớn nhất là " + max);
        return max;

    }
    public static void findElementInArr(int arr[][], int element) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (element == arr[i][j]) {
                    check = true;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("Tìm thấy " + element + " trong mảng");
        } else {
            System.out.println("Không Tìm thấy " + element + " trong mảng");
        }
    }

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4}, {5, 76, 7}};
        findMaxElementInMultiArr(array);

        findElementInArr(array, 2);
        findElementInArr(array, 22);
    }
}
