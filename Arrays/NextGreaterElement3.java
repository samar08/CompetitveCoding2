class Solution {
    public int nextGreaterElement(int n) {
        String string=Integer.toString(n);
        int i,len=string.length();
        int[] arr=new int[len];
        int firstDeflectionPoint=-1,secondDeflectionPoint=-1;
        int min=10;
        for(i=0;i<len;i++){
            arr[i]=string.charAt(i)-'0';
        }
        for(i=len-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                firstDeflectionPoint=i;
                break;
            }
        }
        if(firstDeflectionPoint==-1){
            return -1;
        }

        for(i=firstDeflectionPoint+1;i<len;i++){
            if(arr[i]>arr[firstDeflectionPoint] && arr[i]<min){
                min=arr[i];
                secondDeflectionPoint=i;
            }
        }
        if(secondDeflectionPoint==-1){
            return -1;
        }
        int temp=arr[firstDeflectionPoint];
        arr[firstDeflectionPoint]=arr[secondDeflectionPoint];
        arr[secondDeflectionPoint]=temp;
        Arrays.sort(arr,firstDeflectionPoint+1,len);
        String out="";
        for(i=0;i<len;i++){
            out+=arr[i];
        }
        String maxans=Integer.toString(Integer.MAX_VALUE);
      
         if(out.length()== 10 && out.compareTo(maxans)>=1){
             return -1;
         }
        return Integer.parseInt(out);


        
    }
}