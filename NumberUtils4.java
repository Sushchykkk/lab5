public class NumberUtils4 {

    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("Найменше число: " + smallest);

        return smallest;
    }

}
