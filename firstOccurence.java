public class firstOccurence {
    
    public static void main(String[] args){

        int[] a = {1,2,2,3,4,4,4,5,7,7,7,7};
        int target = 7;
        int result = search(a, target);
        System.out.println(result);

    }

    public static int search(int[] a, int target){

        if(a == null || a.length == 0){
            return -1;
        }

        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(a[mid] < target){
                start = mid + 1;
            }
            else if(a[mid] > target || (a[mid] == target && mid > 0 && a[mid - 1] == target)){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

}
