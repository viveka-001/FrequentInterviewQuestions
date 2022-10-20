class Main {
    public int trap(int[] height) {
        int len=height.length;
        int ans=0;
        int left=1;
        int leftMax=height[0];
        int right=len-2;
        int rightMax=height[len-1];
        while(left<=right)
        {
            if(leftMax<rightMax)
            {
                if(height[left]<=leftMax)
                {
                    ans+=leftMax-height[left];
                    left++;
                    
                }
                else
                {
                    leftMax=height[left];
                    left++;
                }
            }
            else
            {
                if(height[right]<=rightMax)
                {
                    ans+=rightMax-height[right];
                    right--;
                }
                else
                {
                    rightMax=height[right];
                    right--;
                }
            }
           
            
        }
        return ans;
        
    }
}
