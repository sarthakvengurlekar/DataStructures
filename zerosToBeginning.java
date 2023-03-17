import java.util.Arrays;

public class zerosToBeginning {

    public static void main(String[] args){

        int[] a = {1,0,3,2,0,6,6,0,0,0,8};
        int[] result = partitionZeros(a);
        System.out.println(Arrays.toString(result));

    }
    
    public static int[] partitionZeros(int[] a){

        int boundary = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                swap(a, i, boundary);
                boundary++;
            }
            
        }
        return a;

    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
