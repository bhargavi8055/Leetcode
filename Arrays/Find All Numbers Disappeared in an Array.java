/*
Question:Find All Numbers Disappeared in an Array.java
  
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ind= Math.abs(nums[i])-1;
            if(nums[ind]<0)
                continue;
            nums[ind]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;
    }
}

