package EX;

public class Ex10 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
