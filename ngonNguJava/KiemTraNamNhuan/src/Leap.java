public class Leap {
    public static void Leap(int year) {
        if (year < 0) {
            System.out.println(year + " là năm TCN!!");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " là năm nhuận");
        } else System.out.println(year + " ko phải là năm nhuận");
    }

    public static void main(String[] args) {
        Leap(-1111);
        Leap(2000);
        Leap(2001);
    }
}
