class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        comb(0,target,result,curr,nums);
        return result;
        
    }
  void comb(int i,int target,List<List<Integer>> result,List<Integer> curr,int []nums){
    if(target==0){
        result.add(new ArrayList<>(curr));
        return;
    }
    if(i==nums.length) return ;
    if(target>=nums[i]){
        curr.add(nums[i]);
        comb(i,target-nums[i],result,curr,nums);
        curr.remove(curr.size()-1);
    }
        comb(i+1,target,result,curr,nums);
    }

    
}