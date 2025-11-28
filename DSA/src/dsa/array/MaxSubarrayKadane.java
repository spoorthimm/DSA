
public class MaxSubarrayKadane{
    public static int maxSubArray(int[] arr){
        int max=arr[0],cur=0;
        for(int n:arr){
            cur=Math.max(n,cur+n);
            max=Math.max(max,cur);
        }
        return max;
    }
}
