public class MedianTwoSortedArrays{
    public static double _Median(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,m1=0,m2=0,count=0;
        int mid=(n+m)/2;
        while(count<=mid){
            m2=m1;

            if(i!=n && j!=m){
                if(nums1[i]>nums2[j]){
                    m1=nums2[j++];
                }else{
                     m1=nums1[i++];
                }
            }else if(i<n){
                m1=nums1[i++];
            }else{
                m1=nums2[j++];
            }
            count++;
        }
        if((n+m)%2==1){
            return (double) m1;
        }else{
            double ans=(double)m1+(double)m2;
            return ans;
        }

    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,6};
        int[] nums2={7,10,12,15};

        double median=_Median(nums1, nums2);
        System.out.println(median);
    }
}