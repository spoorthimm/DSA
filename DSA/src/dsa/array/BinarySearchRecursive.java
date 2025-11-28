
public class BinarySearchRecursive{
    public static int search(int[] arr,int target,int l,int r){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]<target) return search(arr,target,mid+1,r);
        return search(arr,target,l,mid-1);
    }
}
