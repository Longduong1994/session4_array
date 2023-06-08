package EX;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int b =10;
        int index =5;
        int arrUpddate[] = new int[10];
//        for (int i = 0; i < arrUpddate.length; i++) {
//            if(i<index){
//                arrUpddate[i] =array[i];
//            }else if(i==index){
//                arrUpddate[i] =b;
//            }else {
//                arrUpddate[i] = array[i-1];
//            };
//        }
        insertArray(array,b, index,arrUpddate);
        System.out.println(Arrays.toString(arrUpddate));

    }
    public static void insertArray(int[] array, int value, int index, int[] arrUpddate){
        for(int i=0; i<arrUpddate.length; i++){
            if(i<index){
                arrUpddate[i] =array[i];
            }else if(i==index){
                arrUpddate[i] = value;
            }else {
                arrUpddate[i] = array[i-1];
            }
        }
    }
}
