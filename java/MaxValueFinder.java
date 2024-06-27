public class MaxValueFinder {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 1;
        int max = findMax(x, y, z);
        System.out.println("Максимальное значение: " + max);
    }

    public static int findMax(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
}
