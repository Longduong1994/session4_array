package EX;

public class Ex5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 4},
                {4, 5, 6},
                {8, 8, 9}
        };

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < array[i].length) {
                sum1 += array[i][i];
            }
            sum2 += array[i][array[i].length - 1 - i];
        }

        System.out.println("Tổng các số trên đường chéo chính là: " + sum1);
        System.out.println("Tổng các số trên đường chéo phụ là: " + sum2);
    }
}
