

public class ArrayExample {
    public static String[] remDupes(String[] array) {
        int newSize = array.length;
        for(int i = 0; i < newSize; i++){
            for(int j=i+1;j<newSize;j++){
                if(array[i].equals(array[j])){
                    newSize--;
                    for(int k=j;k<newSize;k++){
                        array[k]=array[k+1];
                    }
                    j--;
                }
            }
        }
        String[] output = new String[newSize];
        for(int i = 0 ; i <newSize;i++){
            output[i]=array[i];
        }
        return output;
    }
}
