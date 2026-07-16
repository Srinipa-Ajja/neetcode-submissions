class Solution {
    int k=0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arrlist=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);
        recur(candidates,target,arrlist,arr,0,0);
        return arrlist;
    }
    public void recur(int nums[],int target,List<List<Integer>> arrlist,List<Integer> arr,int sum,int index){
        if(sum>target)
            return;
        if(sum==target){
            arrlist.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(k==nums[i])
                continue;
            arr.add(nums[i]);
            recur(nums,target,arrlist,arr,sum+nums[i],i+1);
            k=arr.remove(arr.size()-1);
            
        }
        return;

    }
}
