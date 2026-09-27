class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1 = -1;
        long sum2 = -1;
        for(int i = 0;i<source.length;i++){
            sum1 = sum1 + source[i];
        }
        for(int i = 0;i<target.length;i++){
            sum2 = sum2 + target[i];
        }
        if(sum1 == sum2){
            return true;
        }
        return false;
        
    }
}