import java.util.HashMap;

public class smallestNum {
    
    public static void main(String[] args){

        int[] a = {5,7,6,9,4,5,7,7,1,5,8,2,2,3};
        int result = smallNum(a);
        System.out.println(result);

    }

    public static int smallNum(int[] a){

        if(a == null){
            return -1;
        }
        int result = -1;
        int ress = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(result, a[0]);
        for(int i = 0; i < a.length; i++){

            if(a[i] < map.get(result)){
                map.put(result, a[i]);
                ress = i;
            }

        }
        return ress;

    }

}
