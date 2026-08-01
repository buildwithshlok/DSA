class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        comb(0,target,result,curr,nums);
        return result;

    }
void comb(int start,int target,List<List<Integer>> result,List<Integer> curr,int [] nums){
        if(target==0) {result.add(new ArrayList<>(curr)); return ;}
        if(start==nums.length) return;
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            if(target>=nums[i]){
                curr.add(nums[i]);
                comb(i+1,target-nums[i],result,curr,nums);
                curr.remove(curr.size()-1);
            }
        }

    }
}