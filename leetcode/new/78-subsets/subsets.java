class Solution {
    public List<List<Integer>> subsets(int[] nums) {
List<List<Integer>> result=new ArrayList<>();
List<Integer> curr=new ArrayList<>();
    perm(0,result,curr,nums);
    return result;
        
    }
void perm(int i,List<List<Integer>> result,List<Integer> curr,int []nums){
    if(i==nums.length){
        result.add(new ArrayList<>(curr));
        return ;
    }
    //take case
    curr.add(nums[i]);
    perm(i+1,result,curr,nums);
    curr.remove(curr.size()-1);
    //not take case
    perm(i+1,result,curr,nums);
}
}