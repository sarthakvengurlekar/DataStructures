public class threeDarray {

    public static void main(String[] args){

        int[][][] array = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.println(array[i][j][k]);
                }
            }
        }

    }
    
}
