package dsa.practise;

import java.util.Arrays;

//Given an array of distinct integers, shuffle it according to the given order of elements.
//        For example:
//        Input:
//        nums[] = { 1, 2, 3, 4, 5 }
//        pos[] = { 3, 2, 4, 1, 0 }
//
//        Output:
//
//        nums[] = { 5, 4, 2, 1, 3 }
//
//        i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
//        In other words, update nums[pos[i]] = nums[i] for every index i.

// Solution 1
public class ShuffleAccToPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] pos = { 3, 2, 4, 1, 0 };
        int[] resultArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            resultArr[pos[i]] = nums[i];
        }
        System.out.println(Arrays.toString(resultArr));
    }
}


// Solution 2
//public class ShuffleAccToPosition {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
//        int[] pos = {3, 2, 4, 1, 0};
//        int temp, temp1 = 0;
//        int removedElementIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            removedElementIndex = pos[i];
//            temp = nums[pos[i]];
//            nums[pos[i]] = nums[i];
//            nums[pos[removedElementIndex]] = temp;
//            nums[i] = temp1;
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//}