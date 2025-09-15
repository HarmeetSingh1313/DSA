class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> r = new ArrayList<>();
      backtrack(candidates,target,0,new ArrayList<>(),r);
      return r;  
    }
    public void backtrack(int[] candidates, int target, int start, List<Integer> cur,List<List<Integer>> r )
    {
      if(target == 0)
      {
        r.add(new ArrayList<>(cur));
        return;
      }
      for(int i=start;i<candidates.length;i++)
      {
        if(candidates[i] <= target)
        {
         cur.add(candidates[i]);   
         backtrack(candidates,target-candidates[i],i,cur,r);
         cur.remove(cur.size()-1);   
        }
      }
    } 
}