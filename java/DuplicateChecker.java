public class DuplicateChecker {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 3;
        boolean hasDuplicates = checkDuplicates(x, y, z);
        if (hasDuplicates) {
            System.out.println("Есть хотя бы два одинаковых числа");
        } else {
            System.out.println("Все числа разные");
        }
    }

    public static boolean checkDuplicates(int x, int y, int z) {
        return x == y || x == z || y == z;
    }
}
