public class slidingWindow {
    
    public static void main(String[] args){

        int[] a = {1,2,3,5,2};
        int target = 10;
        Pair<Integer> result = subarraySum(a, target);
        System.out.println(result.getFirst() + ", " + result.getSecond());

    }

    public static Pair<Integer> subarraySum(int[] a, int target){

        if(a == null || a.length == 0){
            return null;
        }
        int start = 0;
        int end = 0;
        int sum = a[0];

        while(start < a.length){

            if(start > end){
                end = start;
                sum = a[start];
            }
            
            if(sum < target){
                if(end == a.length - 1){
                    break;
                }
                end++;
                sum = sum + a[end];
            }

            else if(sum > target){
                sum = sum - a[start];
                start++;
            }
            else{
                return new Pair<Integer>(a[start], a[end]);
            }

        }
        return null;

    }

}

class Pair<T>{

    T first;
    T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}
