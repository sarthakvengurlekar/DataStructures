public class binarySearch {
    
    public static void main(String[] args){

        int[] a = {1,4,5,7,8,10,11,17,25};
        int target = 8;
        int result = binarySearchalgo(a, target);
        System.out.println(result);

    }

    public static int binarySearchalgo(int[] a, int target){

        if(a == null || a.length == 0){
            return -1;
        }

        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(a[mid] > target){
                end = mid - 1;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

}
