class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> arrlist=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        recur(nums,target,arrlist,arr,0,0);
        return arrlist;
    }
    public void recur(int nums[],int target,List<List<Integer>> arrlist,List<Integer> arr,int sum,int index){
        if(sum==target){
            arrlist.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(sum<=target){
                arr.add(nums[i]);
                recur(nums,target,arrlist,arr,sum+nums[i],i);
                arr.remove(arr.size()-1);
            }
        }
        return;

    }
}
