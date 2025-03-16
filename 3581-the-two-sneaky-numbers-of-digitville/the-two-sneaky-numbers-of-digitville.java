class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
       int[] arr=new int[2];
       int c=0;
       for(int i=0;i<nums.length;i++) 
       {
        if(!h.containsKey(nums[i]))
        {
           h.put(nums[i],1);
        }
        else
        {
         arr[c]=nums[i];
         c++;
        }
       }
    return arr;   
    }
}