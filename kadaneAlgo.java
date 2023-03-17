public class kadaneAlgo {
    
    public static void main(String[] args){

        int[] a = {1,2,-1,2,-3,2,-5};
        int result = kadaneAlgorithm(a);
        System.out.println(result);

    }

    public static int kadaneAlgorithm(int[] a){
        int result = a[0];
        int maxSum = a[0];
        for(int i = 1; i < a.length; i++){
            maxSum = Math.max(a[i], maxSum + a[i]);
            result = Math.max(maxSum, result);
        }
        return result;
    }

}
