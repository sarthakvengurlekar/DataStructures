import java.util.Arrays;

public class reverseTraversal {

    public static void main(String[] args){

        int[] a = {2,1,4,8,6,5,-1,-1,-1,-1};
        
        int[] clonedArray = cloneEvenNumbers(a);

        System.out.println(Arrays.toString(clonedArray));
    }
    
    public static int[] cloneEvenNumbers(int[] a){

        if(a == null || a.length == 0){
            return a;
        }

        int end = a.length;
        int i = getLastNumber(a);
        
        while(i >= 0){
            if(a[i] % 2 == 0){
                end--;
                a[end] = a[i];
                end--;
                a[end] = a[i];
            }
            else{
                end--;
                a[end] = a[i];
            }
            i--;
        }
        return a;
        
        
    }
    public static int getLastNumber(int[] a){
        int i = a.length - 1;
        while(i >= 0 && a[i] == -1){
            i--;
        }
        return i;
    }
    // public static int[] cloneEvenNumbers(int[] a){

    //     if(a == null || a.length == 0){
    //         return a;
    //     }

    //     int end = a.length;
    //     int i = getLastNumber(a);
    //     while(i >= 0){

    //         if(a[i] % 2 == 0){
    //             end--;
    //             a[end] = a[i];
    //             end--;
    //             a[end] = a[i];
    //         }
    //         else{
    //             end--;
    //             a[end] = a[i];
    //         }
    //         i--;
    //     }
    //     return a;
    // }

    // public static int getLastNumber(int[] a){
    //     int i = a.length - 1;
    //     while (i >= 0 && a[i] == -1){
    //         i--;
    //     }
    //     return i;
    // }
    

}
