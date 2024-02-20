public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot=low;
        int i1=low;
        int i2=high;
        while(i1<i2){
            while(i1<=high && arr[i1]<=arr[pivot]){
                i1++;
            }
            while(i2>=low && arr[i2]>arr[pivot]){
                i2--;
            }
            if(i1<i2){
                int temp=arr[i1];
                arr[i1]=arr[i2];
                arr[i2]=temp;
            }
        }
        int temp=arr[i2];
        arr[i2]=arr[pivot];
        arr[pivot]=temp;
        return i2;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int partitionIndex=partition(arr, low, high);
            quicksort(arr, low, partitionIndex-1);
            quicksort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,1,11,8,18,121,100,2,1,8,18,100};
        int n=arr.length,high=n-1,low=0,i;
        quicksort(arr,low,high);
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
