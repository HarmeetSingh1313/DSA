class Solution {
    public boolean divideArray(int[] nums) {
    int n=nums.length;
    HashMap<Integer,Integer> h=new HashMap<>();
    if(n%2!=0)
     return false;
    for(int i=0;i<n;i++)
    {
      h.put(nums[i],h.getOrDefault(nums[i],0)+1);
    }     
    for(Integer i:h.values())
    {
      if(i%2!=0)
       return false;
    }
    return true;
    }
}