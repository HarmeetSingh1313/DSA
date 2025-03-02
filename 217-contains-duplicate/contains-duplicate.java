//beats 9.90% (Used Sorting)
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//     Arrays.sort(nums);
//     for(int i=0;i<nums.length-1;i++)
//     {
//         if(nums[i]==nums[i+1])
//         {
//             return true;
//         }
//     }
//     return false;
//  }
// }


//beats 88.41%
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//     HashSet<Integer> h=new HashSet<>();
//     for(int i=0;i<nums.length;i++)
//     {
//         if(!h.contains(nums[i]))
//         {
//           h.add(nums[i]);
//         }
//         else
//          return true;
//     }
//     return false;    
//     }
// }

//chat gpt
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            if (!h.add(num)) { // add() returns false if the element already exists
                return true;
            }
        }
        return false;
    }
}
