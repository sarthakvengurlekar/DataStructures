import java.util.HashMap;

public class uniqueChar {
    
    public static void main(String[] args){

        String input = "whatwhywhere";
        Pair<Integer> result = allUnique(input);
        System.out.println(result.getFirst() + ", " + result.getSecond());

    }

    public static Pair<Integer> allUnique(String input){

        if (input == null){
            return null;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        Pair<Integer> result = new Pair<Integer>(0, 0);
        int start = 0;
        int end = 0;
        int longest = 1;
        map.put(input.charAt(0), 0);

        while(end < input.length() - 1){

            end++;
            char toAdd = input.charAt(end);
            if(map.containsKey(toAdd) && map.get(toAdd) >= start){
                start = map.get(toAdd) + 1;
            }
            map.put(toAdd, end);

            if(end - start + 1 > longest){
                longest = end - start + 1;
                result.setFirst(start);
                result.setSecond(end);
            }

        }
        return result;
        
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

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(T second){
        this.second = second;
    }

}
