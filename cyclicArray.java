public class cyclicArray {
    
    public static void main(String[] args){

        int[] a = {14,2,3,4,5};
        int result = binnSearch(a);
        System.out.println(result);

    }

    public static int binnSearch(int[] a){

        if(a == null || a.length == 0)
            return -1;

        int start = 0;
        int end = a.length - 1;
        int right = a[a.length - 1];

        while(start <= end){

            int mid = start + (end - start) / 2;
            if(a[mid] <= right && (mid == 0 || a[mid - 1] > a[mid])){
                return mid;
            }
            else if(a[mid] > right){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

        return -1;

    }

}
