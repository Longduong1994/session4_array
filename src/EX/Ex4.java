package EX;

public class Ex4 {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 4},{5,6,7, 8},{8, 9, 10,11}};
        int max = arr[0][0];

        for(int i = 1; i<arr.length; i++) {
            for(int j = 1; j<arr[i].length; j++) {
                if(max<arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("ptu lon nhat trong mang 2 chieu la :" + max);
    }
}
