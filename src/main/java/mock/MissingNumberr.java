package mock;

import java.util.ArrayList;

public class MissingNumberr {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 9, 10, 11}; // 0,1,6,7,8 missing
        //0 1 2 3 4 5 6 7 8 9 10

        System.out.println(missingNumber(nums));
    }

    public static int[] missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            for (int i = 0; i < nums[nums.length - 1]; i++)
                if (!list.contains(i)) {

                }
        }
return nums;
    }

}


