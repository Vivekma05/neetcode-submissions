class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suff=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i - 1], height[i]);
        }
        suff[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],height[i]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int w=Math.min(prefix[i],suff[i])-height[i];
           
            count+=w;
        }
        return count;
    }
}
