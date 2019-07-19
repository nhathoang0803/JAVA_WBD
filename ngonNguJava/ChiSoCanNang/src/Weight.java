public class Weight {
    public static void getBMI(float height, float weight) {
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else
            System.out.println("Obese");
    }

    public static void main(String[] args) {
        getBMI(180,80);
    }
}
