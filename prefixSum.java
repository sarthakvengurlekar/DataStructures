import java.util.HashMap;

public class prefixSum {

    public static void main(String[] args){

        int[] a = {2,4,-2,1,-3,5,-3};
        int target = 5;
        Pair<Integer> result = targetSum(a, target);
        System.out.println(result.getFirst() + ", " + result.getSecond());

    }

    public static Pair<Integer> targetSum(int[] a, int target){

        if(a == null || a.length == 0){
            return null;
        }

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length - 1; i++){

            sum = sum + a[i];
            if(sum == target){
                return new Pair<Integer>(0, i);
            }
            if(map.containsValue(sum)){
                return new Pair<Integer>(map.get(sum) + 1, i);
            }
            map.put(sum, i);

        }

        return null;

    }
     
}
