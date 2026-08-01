class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    Arrays.sort(nums);
    perm(0,result,curr,nums);
    return result;
        
    }
void perm(int i,List<List<Integer>> result,List<Integer> curr,int []nums){
        result.add(new ArrayList<>(curr));
    for(int j=i;j<nums.length;j++){
        if(j>i && nums[j]==nums[j-1]) continue;
    //take case
    curr.add(nums[j]);
    perm(j+1,result,curr,nums);
    curr.remove(curr.size()-1);
}
}}