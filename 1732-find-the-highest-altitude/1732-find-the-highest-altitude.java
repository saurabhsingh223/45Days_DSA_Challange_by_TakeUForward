class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int max = 0;
        for(int  i = 0; i<gain.length; i++){
            max += gain[i];
            if(max > maxAltitude){
                maxAltitude = max;
            }
        }
        return maxAltitude;
    }
}