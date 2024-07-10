/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively. 
給兩個整數陣列 分別為nums1 & nums2 ,按 非遞減順序 排序,
並且有兩個整數 m & n 分別代表nums1 & nums2 的元素數量．

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
將nums1 & nums2 合併成一個單一陣列，並按 非遞減順序 排序．

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
最終的排序陣列 不應由方法返回，而是取代儲存在陣列nums 1 

To accommodate this, nums1 has a length of m + n,
where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
為了適應這個，nums1 的長度為m+n，其中前m個元素代表應合併，最後n個元素設為0 應忽略， nums2 的長度為n．

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     for ( int j = 0, i = m; j<n ; j++){
        nums1[i] = nums2[j];
        i++;
     }
      Arrays.sort(nums1);
    }
}