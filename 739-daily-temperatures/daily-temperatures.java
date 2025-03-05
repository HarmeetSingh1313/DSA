//Time Limit Exceeded( brute force approach)
// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n=temperatures.length;
//         int[] arr=new int[n];
//         arr[n-1]=0;
//         for(int i=0;i<n-1;i++)
//         {
//          int c=1;   
//         for(int j=i+1;j<n;j++)
//         {
//           if(temperatures[i] >= temperatures[j])
//           {
//             c++;
//           }
//           else
//           {
//             arr[i]=c;
//             break;
//           } 
//         }  
          
//         }
//     return arr;    
//     }
// }
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int n=temperatures.length;
    int[] arr=new int[n];
    Stack<Integer> h=new Stack<>();
    for(int i=0;i<n;i++)
    {
        while(!h.isEmpty() && temperatures[i]>temperatures[h.peek()])
        {
           int in=h.pop(); 
           arr[in]=i-in;
        }
        h.push(i);
    }
    return arr;
    }
}