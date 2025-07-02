class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if((i+1)%3==0 && (i+1)%5!=0)
            a.add(i,"Fizz");
            else if((i+1)%5==0 && (i+1)%3!=0)
            a.add(i,"Buzz");
            else if((i+1)%5==0 && (i+1)%3==0)
            a.add(i,"FizzBuzz");
            else
            {
            a.add(i,Integer.toString(i+1));
            }
        }
    return a; 
    }
}