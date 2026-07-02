class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int m=0;
        while(l<r){
            int a=Math.min(heights[l],heights[r])*(r-l);
            m=Math.max(m,a);
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return m;
    }
}
