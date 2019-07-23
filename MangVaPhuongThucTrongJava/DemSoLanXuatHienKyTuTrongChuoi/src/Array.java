public class Array {
    public static int countChar(String str, char word) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của từ " + word + " trong chuỗi " + str + " là: " + count);
        return count;
    }

    public static void main(String[] args) {
        countChar("nguyen dang phong ", 'n');
    }
}
