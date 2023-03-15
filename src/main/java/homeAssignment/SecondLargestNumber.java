package homeAssignment;

import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
//////////////////////////////////////////////////NOT CORRECT
    }

        public static int secondLargestNumber (List < Integer > nums) {
            if (nums == null || nums.size() < 2) {
                return -1;
            }

            Collections.sort(nums);

            int largest = nums.get(nums.size() - 1);

            for (int i = nums.size() - 2; i >= 0; i--) {
                int current = nums.get(i);
                if (current < largest) {
                    return current;
                }
            }

            return -1;

        }
    }

