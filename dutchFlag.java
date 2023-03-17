import java.util.Arrays;

public class dutchFlag {
    
    public static void main(String[] args){

        int[] a = {7,2,3,1,3,5,3,1,6,6};
        int pivot = 3;
        int[] result = partitionArray(a, pivot);
        System.out.println(Arrays.toString(result));

    }

    public static int[] partitionArray(int[] a, int pivot){

        int start = 0;
        int end = a.length - 1;
        int i = 0;
        while(i <= end){
            if(a[i] < pivot){
                swap(a, i, start);
                start++;
                i++;
            }
            else if(a[i] > pivot){
                swap(a, i, end);
                end--;
            }
            else{
                i++;
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
