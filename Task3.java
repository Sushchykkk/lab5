import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        NumberUtils2.printArray(array);
    }

}
