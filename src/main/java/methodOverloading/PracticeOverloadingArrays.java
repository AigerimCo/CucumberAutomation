package methodOverloading;

import java.util.Arrays;

public class PracticeOverloadingArrays {

    /*
      create int [] rotate(), which takes:
                        array of ints
                        String rotate
      if rotate = left: 1,2,3  => 2,3,1
      if rotate = right: 1,2,3 => 3,2,1
      return rotated int []
     */
    public static int[] rotate(int[] array, String rotate) {
        if (rotate.equals("left")) {
            int[] newRotated = {array[1], array[2], array[0]};
            return newRotated;
        } else if (rotate.equals("right")) {
            int[] newRotated = {array[2], array[1], array[0]};
            return newRotated;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(Arrays.toString(rotate(array1, "left"))); //2,3,1
        System.out.println(Arrays.toString(rotate(array2, "left"))); //5,6,4
        System.out.println(Arrays.toString(rotate(array1, "right"))); //3,2,1
        System.out.println(Arrays.toString(rotate(array1, "down"))); //1,2,3

        System.out.println(Arrays.toString(rotate(array1, "left", false)));
        System.out.println(Arrays.toString(rotate(array1, "right", true)));

        reverse("apple");
        reverse("apple", "hello", true);
        reverse("apple", "hello", false);

    }

    /*
  create int [] rotate(), which takes:
                    array of ints
                    String rotate
                    boolean goRotate
  if goRotate = true, rotate:
  if rotate = left: 1,2,3  => 2,3,1
  if rotate = right: 1,2,3 => 3,2,1
  return rotated int []
  if goRotate = false, do not rotate
 */
    public static int[] rotate(int[] array, String rotate, boolean goRotate) {
        if (goRotate) {
            if (rotate.equals("left")) {
                int[] newRotated = {array[1], array[2], array[0]};
                return newRotated;
            } else if (rotate.equals("right")) {
                int[] newRotated = {array[2], array[1], array[0]};
                return newRotated;
            }
        }
        return array;
    }


    /*
    create a method, which takes String,
    and returns reversed String
    apple ==> elppa
    Chicago ==> ogacihC
     */

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public static String reverse(String str, boolean b) {
        if (b) {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            System.out.println(result);
            return result;
        }
        return str;
    }

    /*
    reverse method, should take String str1, boolean b, String str2
    if b = true, reverse both Strings, and return concatenated String, str1 + str2
    else, return concatenated Strings

     */

    public static String reverse(String str, String str1, boolean b) {
        if (b) {
            String result = "";
            String result1 = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }

            for(int j = str1.length() - 1; j >= 0; j--){
                result1 = result1 + str1.charAt(j);
            }
            System.out.println(result + ", " + result1);
            return result  + ", " + result1;
        }
        System.out.println(str + ", " + str1);
        return str + ", " + str1;
    }

}
