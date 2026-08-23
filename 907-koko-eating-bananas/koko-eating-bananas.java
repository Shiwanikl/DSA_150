class Solution {
    public int calculatefun(int[] piles , int speed){
        int n = piles.length;
        int hour = 0;
        for(int i =0 ; i<n;i++){
            hour = hour + piles[i]/speed;
            if(piles[i]%speed!=0){
                hour++;
            }
            
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int res = -1;
        int high = Integer.MAX_VALUE;
        
        for(int i = 0 ;i<n;i++){
            high = Math.max(high , piles[i]);
        }
        while(low<=high){
        int speed = low + (high-low)/2;
        int hour = calculatefun(piles,speed);
        if(hour <= h){
            res = speed;
            high = speed-1;
        }
        else{
            low = speed+1;
        }
        }
        return res;

        
    }
}