import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,6,5,4};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));


    }
    
    public static void reverseArr(int[] a){
        int start = 0;
        int end = a.length - 1;
        while(start < end){
            swap(a, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
