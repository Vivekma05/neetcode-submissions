class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ne=target-nums[i];
            if(map.containsKey(ne)){
                return new int[]{map.get(ne),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}