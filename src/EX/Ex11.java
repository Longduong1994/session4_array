package EX;
import java.util.Arrays;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3, 8, 5, 8};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần xóa: ");
        int numberToDelete = scanner.nextInt();

        int count = 0;
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberToDelete) {
                array[currentIndex] = array[i];
                currentIndex++;
            } else {
                count++;
            }
        }

        while (currentIndex < array.length) {
            array[currentIndex] = 0;
            currentIndex++;
        }

        System.out.println("Số lần xuất hiện của phần tử " + numberToDelete + " là: " + count);
        System.out.println("Mảng sau khi xóa phần tử:");
        System.out.println(Arrays.toString(array));
    }
}
