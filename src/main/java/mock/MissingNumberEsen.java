package mock;

public class MissingNumberEsen {
    public static void main(String[] args) {
        //finding missing numbers without sorting method
        //[4,2,9,5]
        //create a method that accept an integer array and integer
        //return true if the given number contains in that array
        int[]ages = {2,4,8,9};
        System.out.println(checkArray(ages,28));// 0,1, 3, 5, 6, 7,

        //Finding the biggest number in the array and return it
        System.out.println(maxElement(ages));//9

        //find the missing number is the array without sorting it
        //create a method that prints out all the missing numbers from array up to maximum value
findMissing(ages);
    }
    public static void findMissing(int[]numbers){
        int max = maxElement(numbers);
        for(int i = 0; i < max; i++){
            if(checkArray(numbers,i)){
                continue;
            }
            System.out.println(i + ", ");
        }
    }
    public static int maxElement(int[]numbers){
        int maxValue = 0;
        for(int i: numbers){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
}
    //create method that checks if certain number is in the given array
    public static boolean checkArray(int [] numbers,int target){
    boolean found = false;
    for(int i: numbers){
        if(i == target){
            found = true;
            break;
        }
    }
      return found;
    }

}
