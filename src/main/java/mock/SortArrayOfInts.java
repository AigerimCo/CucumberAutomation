package mock;

import java.util.Arrays;
public class SortArrayOfInts {
    public static void main(String[] args) {
        int [] array = {1,3,4,2,0,9};
        sortIntArrayAsc(array);
    }
    /*
    9,4,7,2,1   ===> 1,2,4,7,9   // 9 -- 4 int temp 1;
     */
    public static int [] sortIntArrayAsc(int [] array){

        for(int i =0; i < array.length; i++){
            int temp=0;
            for(int j = i+1; j < array.length; j++ ){
                if(array[i] > array[j]){
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));

        return array;
    }
}


