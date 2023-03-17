public class recordnMove {
    
    public static void main(String[] args){

        int[] a = {11,22,33,44,55,66,77,88,99};
        int target = 60;
        int result = closestNumber(a, target);
        System.out.println(result);

    }


    public static int closestNumber(int[] a, int target){

        if(a == null || a.length == 0){
            return -1;
        }

        int start = 0;
        int end = a.length - 1;
        int result = -1;
        while(start <= end){

            int mid = start + (end - start) / 2;
            result = record(a, mid, result, target);
            if(a[mid] <= target){
                start = mid + 1;
            }
            else if(a[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }

        return result;

    }

    public static int record(int[] a, int mid, int result, int target){

        if(result == -1){
            return mid;
        }

        if(Math.abs(a[mid] - target) < Math.abs(a[result] - target)){
            return mid;
        }

        return result;

    }

}
