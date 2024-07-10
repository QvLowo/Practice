/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
給定一個按非遞減順序排序的整數陣列 nums，原地移除重複的元素，使得每個唯一元素只出現一次。元素的相對順序應保持不變。然後返回 nums 中唯一元素的數量。

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
考慮 nums 中唯一元素的數量為 k，為了通過要求，你需要做以下幾件事：

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
	1.	修改陣列 nums，使 nums 的前 k 個元素包含原先在 nums 中出現的唯一元素，且順序保持不變。
	2.	陣列 nums 中剩餘的元素和陣列的大小不重要。
	3.	返回 k。
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i<nums.length; i ++){
            if (nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}