import java.util.Arrays;

public class marblesPartition {
    
    public static void main(String[] args){

        int[] a = {1,0,1,2,1,0,1,2};
        int[] result = partitionArray(a);
        System.out.println(Arrays.toString(result));

    }

    public static int[] partitionArray(int[] a){

        if(a == null)
            return null;

        int middle = 1;
        int start = 0;
        int end = a.length - 1;
        int i = 0;
        while(i <= end){
            if(a[i] < middle){
                swap(i, start, a);
                start++;
                i++;
            }
            else if(a[i] > middle){
                swap(i, end, a);
                end--;
            }
            else{
                i++;
            }
            
        }
        return a;

    }
    public static void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
