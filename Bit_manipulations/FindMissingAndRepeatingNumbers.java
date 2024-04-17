/*
 * Question link: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
 */
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int i;
        int[] out=new int[2];
        int xor=arr[0];
        for(i=1;i<n;i++){
            xor=xor^arr[i];
        }
        for(i=1;i<=n;i++){
            xor=xor^i;
        }
        int max=(int)Math.pow(2,30);
        while((max&xor)==0){
            max>>=1;
        }
        int left=0,right=0;
        for(i=0;i<n;i++){
            if((max&arr[i]) > 0){
                left=left^arr[i];
            }
            else{
                right^=arr[i];
            }
        }
        for(i=1;i<=n;i++){
            if((max&i)>0){
                left=left^i;
            }
            else{
                right=right^i;
            }
        }
        int count=0;
        for(i=0;i<n;i++){
            if(arr[i]==left){
                count+=1;
            }
        }
        if(count==2){
            return new int[]{left,right};
        }
        else{
            return new int[]{right,left};
        }
    }
}