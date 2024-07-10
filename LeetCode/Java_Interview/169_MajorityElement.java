/*
Given an array nums of size n, return the majority element.
給定一個大小為 n 的陣列 nums，返回其中的多數元素。

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
多數元素是指在陣列中出現次數超過 ⌊n / 2⌋ 的元素。你可以假設陣列中總是存在多數元素。
*/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int arrayLength = nums.length;
        return nums[arrayLength/2];
    }
}