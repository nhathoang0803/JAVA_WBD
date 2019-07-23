import java.util.Scanner;

public class studentExamination {
    public static void findStudentPassExam(int[] listStudent) {
        int count = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] > 5 && listStudent[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số sinh viên đậu là: " + count);
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng học sinh: ");
        Scanner scanner = new Scanner(System.in);
        int size;
        size = scanner.nextInt();
        int classB[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập điểm HS thứ " + (i + 1) + ": ");
            classB[i] = scanner.nextInt();
        }

        findStudentPassExam(classB);
    }
}
