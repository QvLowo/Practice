/*
Given an integer array nums and an integer val, 
remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
給定一個整數陣列 nums 和一個整數 val，
移除 nums 中所有等於 val 的元素，且操作需在原地進行。元素的順序可以改變。然後返回 nums 中不等於 val 的元素數量。

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
考慮 nums 中不等於 val 的元素數量為 k，為了通過要求，你需要做以下幾件事：

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.
	1.	修改陣列 nums，使 nums 的前 k 個元素包含那些不等於 val 的元素。
	2.	陣列 nums 中剩餘的元素和陣列的大小不重要。
	3.	返回 k。
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

