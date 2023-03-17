import java.util.HashMap;

public class sumToZero {
    
    public static void main(String[] args){

        int[] a = {2,4,-2,1,-3,5,-3};
        Pair<Integer> result = prefixSum(a);
        System.out.println(result.getFirst() + ", " + result.getSecond());

    }

    public static Pair<Integer> prefixSum(int[] a){

        if(a == null || a.length == 0){
            return null;
        }

        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < a.length - 1; i++){
            sum = sum + a[i];
            if(sum == 0){
                return new Pair<>(0, i);
            }
            if(map.containsKey(sum)){
                return new Pair<Integer>(map.get(sum) + 1, i);
            }
            map.put(sum, i);
        }
        return null;

    }

}
