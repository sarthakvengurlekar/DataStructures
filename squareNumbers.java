import java.util.Arrays;

public class squareNumbers {

    // public static void main(String[] args){
    //     int[] a = {-4,-2,0,1,3,5};
    //     int[] result =squareArray(a);
    //     System.out.println(Arrays.toString(result));
    // }

    // public static int[] squareArray(int[] a){

    //     if(a == null)
    //         return null;

    //     int start = 0;
    //     int end = a.length - 1;
    //     int[] result = new int[a.length];
    //     int resultIndex = result.length - 1;

    //     while(start <= end){
    //         if(abs(a[start]) > abs(a[end])){
    //             result[resultIndex] = square(a[start]);
    //             start++;
    //         }
    //         else{
    //             result[resultIndex] = square(a[end]);
    //             end--;
    //         }
    //         resultIndex--;
    //     }
    //     return result;

    // }
    // public static int abs(int number) {
    //         return number >= 0 ? number : -1 * number;
    //     }

    // public static int square(int i){
    //     return (i * i);
    // }
    

        public static void main(String[] args){

            int[] a = {-2,-1,0,2,4,5};
            int[] result = squareArrayy(a);
            System.out.println(Arrays.toString(result));

        }

        public static int[] squareArrayy(int[] a){

            if(a == null || a.length == 0){
                return null;
            }
            
            int start = 0;
            int end = a.length - 1;
            int[] result = new int[a.length];
            int resultIndex = result.length - 1;

            while(start <= end){

                if(abs(a[start]) < abs(a[end])){
                    result[resultIndex] = square(a[end]);
                    end--;
                    
                }
                else{
                    result[resultIndex] = square(a[start]);
                    start++;
                }

                resultIndex--;

            }

            return result;

        }

        public static int abs(int a){
            return a >= 0 ? a : -1 * a;
        }

        public static int square(int a){
            return a * a;
        }


}
