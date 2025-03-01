// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//       List<List<String>> a =new ArrayList<>();
//       HashMap<String,List<String>> h= new HashMap<>();
//       for(int i=0;i<strs.length;i++)
//       {
//        char[] arr=strs[i].toCharArray();
//        Arrays.sort(arr);
//        String s1=new String(arr);
//        h.computeIfAbsent(s1,k -> new ArrayList<>()).add(strs[i]);
//       }
//       for(List<String> l :h.values())
//       {
//         a.add(l);
//       }
//     return a;    
//     }
// }


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> h=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
        char[] arr=strs[i].toCharArray();
        Arrays.sort(arr);
        String s1 = new String(arr);
        h.computeIfAbsent(s1, k -> new ArrayList<>()).add(strs[i]);
       }
      return new ArrayList<>(h.values());    
    }
}