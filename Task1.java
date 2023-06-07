public class Task1 {
    public static void main(String[] args) {
        int width = 5;
        int height = 10;

        int area = calculateRectangleArea(width, height);
        System.out.println("Площа прямокутника: " + area);
    }

    public static int calculateRectangleArea(int width, int height) {
        int area = width * height;
        return area;
    }
}