class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n1=grid.length;
        int n2=grid[0].length;
        int n3=n1*n2;
        int max=0,t=0;
        int[] arr=new int[2];
        int[] arr1=new int[n3+1];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n1;i++)
        {
          for(int j=0;j<n2;j++)
          {
            h.put(grid[i][j],h.getOrDefault(grid[i][j],0)+1);
          }  
        }
        for(int i=0;i<n1;i++)
        {
          for(int j=0;j<n2;j++)
          {
            if(arr1[grid[i][j]]!=1 )
            {
               arr1[grid[i][j]]=1; 
            }
          }  
        }
        for(int in : h.keySet())
        {
          if(h.get(in)>max)
          {
            max=h.get(in);
            arr[0]=in;
          }
        }
        for(int i=1;i<n3+1;i++)
        {
            if(arr1[i]==0 )
            {
               arr[1]=i; 
            }  
        }
    return arr;    
    }
}