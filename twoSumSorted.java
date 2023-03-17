

public class twoSumSorted {

    public static void main(String[] args){
        int[] a = {1,2,3,6,7,9,10};
        int target = 15;
        IntPair result = twoSum(a, target);
        System.out.println(result);
    }
    
    public static IntPair twoSum(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        while(start < end){
            int sum = a[start] + a[end];
            if(sum < target){
                start++;
            }
            else if(sum > target){
                end--;
            }
            else{
                return new IntPair(a[start], a[end]);
            }
        }
        return null;
    }


}
