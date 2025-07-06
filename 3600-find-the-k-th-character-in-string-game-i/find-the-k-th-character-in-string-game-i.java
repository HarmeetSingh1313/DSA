class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder();
        s.append('a');
        while(s.length()<k)
        {
            int l=s.length();
            int i=0;
            while(i<l && s.length()<k)
            {
                if(s.charAt(i) != 'z')
                {
                int x=s.charAt(i)+1;
                char s1=(char)x;    
                s.append(s1);     //s.append((char)s.charAt(i)+1);
                i++;
                }
                else
                {
                s.append('a');
                i++;
                }

            }
        }
    return (s.charAt(k-1));    
    }
}      