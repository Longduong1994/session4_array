package EX;

import java.util.Scanner;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10); // Sinh số ngẫu nhiên từ 0 đến 9
            }
        }

        System.out.println("Mảng 2 chiều được tạo:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.print("Nhập vị trí cột (bắt đầu từ 1): ");
        int columnPosition = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (columnPosition >= 1 && columnPosition <= array[i].length) {
                sum += array[i][columnPosition - 1];
            } else {
                System.out.println("Vị trí cột không hợp lệ!");
                sum = 0;
                break;
            }
        }

        System.out.println("Tổng các số trong cột là: " + sum);
    }

}
