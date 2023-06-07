public class NumberUtils3 {
    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Масив порожній");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
