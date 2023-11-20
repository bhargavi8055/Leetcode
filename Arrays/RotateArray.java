/*
Question: Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
*/

class Solution {

    public void rotate(int[] nums, int k) {

      /* one solution - Time Complexity - O(k*n)

      for(int i =0;i<k;i++){

           int n= nums[nums.length-1];

           for(int j=nums.length-1;j>0;j--){

               nums[j]= nums[j-1];

               }

           nums[0] =n;
           }

           */

        /* second solution - Time Complexity - O(n), Space Complexity - O(n)

        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++) arr[i] = nums[i];
        
        for(int i=0;i<nums.length;i++) nums[(i+k) % nums.length] = arr[i];

         */
      /* Another Solution with Time Complexity - O(n) , Space Complexity - O(1)
       */
        k%=nums.length;
        reverse(nums,0,nums.length-1);

        reverse(nums,0,k-1);

        reverse(nums,k,nums.length-1);

    }

    private void reverse(int[] nums,int start, int end){

        while(start<end){

            int temp = nums[start];

            nums[start++]=nums[end];

            nums[end--]=temp;

            }

    }

}
