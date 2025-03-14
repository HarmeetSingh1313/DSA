// In this i am not able to pass all test for larget input i am getting TLE
// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n=gas.length;
//         int index=-1,j=0;
//         for(int i=0;i<n;i++)
//         {
//            j=i; 
//            if(gas[i]<cost[i]) 
//             continue;
//            int t=gas[i]-cost[i];
//            if(j+1<n)
//             j++;
//            else
//             j=0;   
//            while(i!=j && j<n)
//            {
//             t=t+gas[j]-cost[j];
//             if(t<0)
//              break;
//             if(j+1<n)
//              j++;
//             else
//              j=0;
//            }
//            if(t>=0)
//             {
//                 index=i;
//                 break;
//             }
//         }
//     return index;    
//     }
// }

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int ts=0,cs=0,index=0; //ts=Total Sum of Tank, cs=Current Sum of Tank
                     //set index to 0 as if we find solution at first index then it help to know that
         for(int i=0;i<n;i++)
        {
         ts=ts+gas[i]-cost[i];
         cs=cs+gas[i]-cost[i];
         
         if(cs<0)   // if value is at first index that is 0 then this if statement will not run
          {
            index=i+1;
            cs=0;
          }
        }
    return (ts>=0)?index:-1;         
    }
}