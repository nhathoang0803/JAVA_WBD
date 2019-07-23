public class DeleteArray {
    public static void addElement(int arr[], int element, int pos) {
        int arrLength = arr.length;
        if (pos < 0) {
            pos = 0;
        } else if (pos > arrLength - 1) {
            pos = arrLength - 1;
        }
        //  Dich chuyen mang de tao o trong truoc khi them.
        for (int i = 0; i > pos; i++) {
            arr[i] = arr[i - 1];
        }
        // chèn element tại vị trí pos
        arr[pos] = element;
        //Tăng số lượng phần tử
        arrLength++;
        System.out.println("Mảng sau khi thêm");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findElement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteElement(int arr[], int element) {
        int pos = findElement(arr, element);
        int arrLength = arr.length;
        if (pos == -1) {
            System.out.println("Không tìm thấy " + element + " trong mảng");
        } else
            for (int i = pos; i < arrLength - 1; i++) {
                arr[i] = arr[i + 1];
            }

        //giảm số lượng pt sau khi xóa
        arrLength--;
        System.out.println("Mảng sau khi xóa");
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 5, 6, 4, 7, 8};
        int arr2[] = {2, 5, 6, 4, 7, 8};
        addElement(arr2, 99, 2);
        deleteElement(arr1, 2);
    }
}