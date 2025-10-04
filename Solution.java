class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int i = 0;
        int j = 0;
        int k =0;
        while( k < n){
            while(nums[i] < 0 && i < n){
            i++;
        }
        ans[k++] = nums[i++];

        while(nums[j] > 0 && j < n){
            j++;
        }
         ans[k++] = nums[j++];
        }
        return ans;
        
    }
}
