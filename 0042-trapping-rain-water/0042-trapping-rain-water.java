class Solution {
    public int trap(int[] ht) {
        int trap=0;
        int n=ht.length;
        int i=0;
        int j=n-1;
        int lm=0,rm=0;

        while(i<j){
            if(ht[i]<=ht[j]){
                
                lm=Math.max(lm,ht[i]);
                trap+=lm-ht[i];
                i+=1;
            }
            else{
               
                rm=Math.max(rm,ht[j]);
                trap+=rm-ht[j];    
                 j-=1;
            }
        }
        return trap;
    }
}