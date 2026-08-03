class Solution {
    public int[] sortArray(int[] nums) {
   
        sort(nums,0,nums.length-1);
        return nums;
    }
    void sort(int arr[],int low,int high){
        if(low>=high) return ;
        int mid=(low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        mergesortedarray(arr,low,mid,high);

    }
    void mergesortedarray(int []arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int idx=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp[idx]=arr[right];
                right++;
            }
            else{
                temp[idx]=arr[left];
                left++;
            }
            idx++;
        }
        while(left<=mid){
            temp[idx]=arr[left];
            idx++;
            left++;
        }
        while(right<=high){
            temp[idx]=arr[right];
            idx++; right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
}