import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // khai bao mang
        int [] arrInt = {1,2,3,4,5} ;
        int arrInt1[];
        System.out.println("mang ban dau "+ Arrays.toString(arrInt));
        test(arrInt);
        System.out.println("mang sau khi thay doi "+ Arrays.toString(arrInt));
        int[] arrInt2= new int[5];
        System.out.println(Arrays.toString(arrInt2));
        String[] arrString = new String[10];
        System.out.println(Arrays.toString(arrString));
        // lay ra phan tu mang [index]
        System.out.println(arrInt[1]);
        // duyet mang
        // fori
        for(int i=0; i<arrInt.length;i++) {
            int element = arrInt[i];
            // lam viec voi ptu tai vi tri i
            System.out.println(element);
        };
        // for each
        for(int e : arrInt) {
            System.out.println(e);
        }
    }
    public static void test(int[] arr){
        arr[1] = 10;
    }
}
