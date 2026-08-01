class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean vis[]=new boolean[nums.length];
        Arrays.fill(vis,false);
        perm(nums,res,curr,vis);
        return res;

        
    }
    void perm(int []nums,List<List<Integer>> res,List<Integer> curr,boolean vis[]){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]==true) continue;
            vis[i]=true;
            curr.add(nums[i]);
            perm(nums,res,curr,vis);
            curr.remove(curr.size()-1);
            vis[i]=false;
        }
    }
}