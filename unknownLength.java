public class unknownLength {
    
    public static int findWithUnknownLength(int[] a, int target){

        if(a == null || a.length == 0){
            return -1;
        }

        int high = 1;
        int lastIndex = -1;

        while(true){

            try {
                int temp = a[high];
            } catch (ArrayIndexOutOfBoundsException e) {
                lastIndex = binarySearchForLastIndex(a, high/2, high);
                break;
            }
            high = high * 2;

        }

        return binarySearchOverRange(a, target, 0, lastIndex);

    }

    private static int binarySearchForLastIndex(int[] a, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            try {
                int temp = a[mid];
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1;
                continue;
            }

            try {
                int temp = a[mid + 1];
            } catch(ArrayIndexOutOfBoundsException e) {
                return mid;
            }

            start = mid + 1;
        }
        return -1;

    }

    private static int binarySearchOverRange(int[] a, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] < target){
                start = mid + 1;
            }
            else if(a[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

}
