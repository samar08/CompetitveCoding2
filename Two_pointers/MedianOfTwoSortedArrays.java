class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int i,j,k=0;
        if((n+m)%2==0){
            int mida,midb,prev=0;
            midb=(int)((n+m)/2);
            mida=midb-1;
            i=0;
            j=0;
            while(i<n && j<m){
                if(nums1[i]<=nums2[j]){
                    if(k==midb){
                        
                        return (double)(prev+nums1[i])/2;
                    }
                    prev=nums1[i];
                    i++;
                    k++;
                }
                else{
                   if(k==midb){
                       
                        return (double)(prev+nums2[j])/2;
                    }
                    prev=nums2[j];
                    j++;
                    k++;
                }
            }
            while(i<n){
                if(k==midb){
                        return (double)(prev+nums1[i])/2;
                    }
                    prev=nums1[i];
                    i++;
                    k++;
            }
            while(j<m){
                if(k==midb){
                        return (double)(prev+nums2[j])/2;
                    }
                    prev=nums2[j];
                    j++;
                    k++;
            }
        }
        else{
            int mid=(int)((n+m)/2);
            i=0;
            j=0;
            while(i<n && j<m){
                if(nums1[i]<nums2[j]){
                    if(k==mid){
                        return (double)nums1[i];
                    }
                    i++;
                    k++;
                }
                else{
                   if(k==mid){
                        return (double)nums2[j];
                    }
                    j++;
                    k++;
                }
            }
            while(i<n){
                if(k==mid){
                        return (double)nums1[i];
                    }
                    i++;
                    k++;
            }
            while(j<m){
                if(k==mid){
                        return (double)nums2[j];
                    }
                    j++;
                    k++;
            }

        }
      return 0d;
    }
}