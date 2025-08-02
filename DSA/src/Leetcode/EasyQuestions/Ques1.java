package Leetcode.EasyQuestions;

public class Ques1 {
    static class Solution {
        int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Leetcode Easy Question 1");
        Solution s1 = new Solution();
        int[] nums = {1, 1, 3};
        int k = s1.removeDuplicates(nums);
        System.out.println("Unique count: " + k);
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
