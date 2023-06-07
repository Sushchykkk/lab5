public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int min = findMin(a, b, c);
        System.out.println("Найменше число: " + min);
    }

    public static int findMin(int num1, int num2, int num3) {
        int min = num1;

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        return min;
    }
}