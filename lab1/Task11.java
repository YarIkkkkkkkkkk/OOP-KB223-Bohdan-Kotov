public class Task11 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int result = sum(array);
        System.out.println("Сума парних чисел: " + result);
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int suma = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }
}
