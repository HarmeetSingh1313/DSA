class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        int t=0;
        int p=0;
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            int  c=h.get(ch);
            if(c>=p)
            {
                t+=c;
            }
            else
            {
                t-=c;
            }
            p=c;
           
        }
    return t;    
    }
}