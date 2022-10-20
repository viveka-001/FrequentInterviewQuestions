class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int c=n1+n2;
        int ans[]=new int[n1+n2],k=0;
        int i=0;
        int j=0;
        while(i<n1&&j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                ans[k++]=nums1[i++];
            }
            else
            {
                ans[k++]=nums2[j++];
            }
        }
        while(i<n1)ans[k++]=nums1[i++];
        while(j<n2)ans[k++]=nums2[j++];
        if(c%2!=0) return ans[ans.length/2];
        else return (double)(ans[c/2]+ans[(c/2)-1])/2;
        
    }
}
