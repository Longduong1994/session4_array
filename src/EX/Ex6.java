package EX;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondLargest);
    }
}
