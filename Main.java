import java.util.HashSet;

public class Main{


    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5};
        
        int target = 9;
        
        IntPair result = twoSumHashSet(a, target);
        
        System.out.println(result);

    }
    
   public static IntPair twoSumHashSet(int[] a, int target){

        if(a == null){
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            if(set.contains(target - a[i])){
                return new IntPair(a[i], target - a[i]);
            }
            else{
                set.add(a[i]);
            }
            
        }
        return null;
   }

    

    
}

