class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        com(0,result,current,nums,target);
        return result;

        
    }
    void com(int i,List<List<Integer>> result,List<Integer> current ,int [] nums,int target){
    
        if(i==nums.length){
        if(target==0) result.add(new ArrayList<>(current));
        return ;}
        //take 
        if(target>=nums[i]){
            current.add(nums[i]);
            com(i,result,current,nums,target-nums[i]);
            current.remove(current.size()-1);
        }
        com(i+1,result,current,nums,target);
        


        //not take


    }
}