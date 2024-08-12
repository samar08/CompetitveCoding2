class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int i=0,maximumUnits=0,length=boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->  b[1]-a[1]);
        while(i<length && truckSize>0){
            if(boxTypes[i][0]<=truckSize){
                maximumUnits+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
            }
            else{
                maximumUnits+=(truckSize)*boxTypes[i][1];
                truckSize=0;
            }
            i++;
        }
        return maximumUnits;
    }
}