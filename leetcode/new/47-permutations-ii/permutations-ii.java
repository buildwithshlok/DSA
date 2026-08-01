class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean []vis=new boolean[nums.length];
        perm(nums,result,curr,vis);
        return result;


    }
    void perm(int nums[],List<List<Integer>> result,List<Integer> curr,boolean vis[]){
        if(curr.size()==nums.length){
            if( !result.contains(curr))
            result.add(new ArrayList<>(curr)); 
        return ;
        }
      //  if(curr.size()==nums.length) return ;
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            // if(i>0 && nums[i]==nums[i-1] && !vis[i-1]) continue;
            curr.add(nums[i]);
            vis[i]=true;
            perm(nums,result,curr,vis);
            curr.remove(curr.size()-1);
            vis[i]=false;


        }
    }
}