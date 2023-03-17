public class insertBinary {
    
    public static void main(String[] args){

        int[] a = {1,4,5,7,10,11,17,25};
        int target = 11;
        int result = binSearch(a, target);
        System.out.println(result);

    }

    public static int binSearch(int[] a, int target){

        if(a == null || a.length == 0){
            return -1;
        }

        int start = 0;
        int end = a.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(a[mid] <= target){

                if(mid == a.length - 1){
                    return mid;
                }
                start = mid + 1;

            }
            else{

                if(mid == 0 || a[mid - 1] <= target){
                    return mid;
                }
                end = mid - 1;
            }

        }

        return -1;

    }

}
