import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapExample {
    
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ariel", 33);
        map.put("Adama", 11);

        int age = map.get("Ariel");
        System.out.println(age);

        map.put("Contra", 46);
        map.put("Ariel", 19);

        age = map.get("Ariel");
        System.out.println(age);

        map.remove("Adama");

        if(map.containsKey("Adama")){
            System.out.println("in the map");
        }
        else{
            System.out.println("not in the map");
        }

        if(map.containsValue(46)){
            System.out.println("in the map");
        }
        else{
            System.out.println("not in the map");
        }

        for(String key : map.keySet()){
            System.out.println(key);
        }

        for(int value : map.values()){
            System.out.println(value);
        }

        for(Entry<String, Integer> pairs : map.entrySet()){
            System.out.println(pairs);
        }

        System.out.println(map.size());

    }

}
