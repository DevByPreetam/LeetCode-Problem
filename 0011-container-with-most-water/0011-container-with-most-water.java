class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxarea=0;
        while(i<j){
                int ht=Math.min(arr[i],arr[j]);
                int width=j-i;
                maxarea=Math.max(maxarea,ht*width);
                if(arr[i]<arr[j]){
                    i++;
                }
                else{
                    j--;
                }
        }
        return maxarea;
    }
}