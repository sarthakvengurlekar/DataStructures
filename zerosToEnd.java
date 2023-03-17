import java.util.Arrays;

public class zerosToEnd {

    public static void main(String[] args){

        int[] a = {0,1,6,0,0,3,0,5,6,0,1};
        int[] result = partitionZeros(a);
        System.out.println(Arrays.toString(result));

    }

    public static int[] partitionZeros(int[] a){

        int boundary = a.length - 1;
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] == 0){
                swap(a, i, boundary);
                boundary--;
            }
            

        }
        return a;
    }
    public static void swap(int[] a, int i, int b){
        int temp = a[i];
        a[i] = a[b];
        a[b] = temp;
    }

}
