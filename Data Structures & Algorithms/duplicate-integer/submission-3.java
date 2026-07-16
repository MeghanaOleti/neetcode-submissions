

class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> see= new HashSet<>();
      for(int i :nums){
        if(see.contains(i)){
            return true; 
        }
        see.add(i);
      }
      return false;
      }
    }
