import java.util.HashSet;

//Brute Force JAVA for Twosum

public class IntPair {

    int first;
    int second;

    public IntPair(int first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "["+first+","+second+"]";
    }




// public static IntPair twoSumBruteForce(int[] a, int target)
// {
//     if (a == null)
//         return null;

//     for (int i = 0; i < a.length; i++)
//     {
//         for (int j = i + 1; j < a.length; j++)
//         {
//             if(a[i] + a[j] == target)
//             {
//                 return new IntPair(a[i], a[j]);
//             }
//         }
//     }
//     return null;

// }


// public static IntPair twoSumBruteForce(int[] a, int target)
// {

//     if (a == null)
//         return null;

//     for (int i = 0; i < a.length; i++){
//         for(int j = i + 1; j < a.length; j++){
//             if(a[i] + a[j] == target){
//                 return new IntPair(a[i], a[j])
//             }
//         }
//     }
//     return null;


// }

public static IntPair twoSumBruteForce(int[] a, int target){

    if (a == null)
        return null;

    for (int i = 0; i < a.length; i++){
        for (int j = i + 1; j < a.length; j++){
            if(a[i] + a[j] == target){
                return new IntPair(a[i], a[j]);
            }
        }
    }
    return null;
}



// public static IntPair twoSumHashSet(int[] a, int target){

//     if (a == null)
//         return null;

//     HashSet<Integer> set = new HashSet<>();
//     for(int i = 0; i < a.length; i++){
//         if(set.contains(target - a[i])) {
//             return new IntPair(a[i], target - a[i]);
//         }
//         else{
//             set.add(a[i]);
//         }
//     }
//     return null;

//}

// public static IntPair twoSumHashSet(int[] a, int target){

//     if (a == null)
//         return null;
    

//     HashSet<Integer> set = new HashSet<>();
//     for (int i = 0; i < a.length; i++){
//         if(set.contains(target - a[i])){
//             return new IntPair(a[i], target - a[i]);
//         }
//         else{
//             set.add(a[i]);
//         }
//     }
//     return null;

// }

public static IntPair twoSumHashSet(int[] a, int target){

    if (a == null)
        return null;


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