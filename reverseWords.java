public class reverseWords {

    public static void main(String[] args){

        String s = "I live in a house";
        String reversedSentence = reverseWordss(s);
        System.out.println(reversedSentence);

    }
    
    public static String reverseWordss(String s){


        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();


        // String[] words = s.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for(int i = words.length - 1; i >= 0; i--){
        //     sb.append(words[i]);
        //     if(i != 0){
        //         sb.append(" ");
        //     }
        // }
        // return sb.toString();

        // StringBuilder sb = new StringBuilder();
        // int end = s.length();

        // for(int i =  s.length() - 1; i >= 0; i--){
        //     if(s.charAt(i) == ' '){
        //         if(sb.length() > 0){
        //             sb.append(' ');
        //         }
        //         sb.append(s.substring(i + 1, end));
        //         end = i;
        //     }
        // }

        // String firstWord = s.substring(0, end);
        // if (sb.length() > 0){
        //     sb.append(' ');
        // }
        // sb.append(firstWord);

        // return sb.toString();

    }

}
