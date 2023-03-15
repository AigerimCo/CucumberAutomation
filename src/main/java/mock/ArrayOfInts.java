package mock;

import java.util.Arrays;

public class ArrayOfInts {
    /*
   create a method which takes int array
   and returns

   9,4,7,2,1,==>1,2,4,7,9
    */
    public static void main(String[] args) {

int[]array = {1,3,4,2,0,9};
        sortIntArrayAsc(array);
    }
    public static int [] sortIntArrayAsc(int [] array){
     //   int[]sortedArr = new int[array.length];

        for(int i = 0; i < array.length;i++){
            int temp = 0;
            for(int j= i+1; j < array.length;j++){
                if(array[i] < array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        return array;
    }
}
/* another easiest way but first solution is better
int[] Arr = new int[]{9, 4, 7, 2, 1};
        System.out.println("original: " + Arrays.toString(Arr));
        Arrays.sort(Arr);
        System.out.println("sorted: " + Arrays.toString(Arr));//[1, 2, 4, 7, 9]
    }
 */