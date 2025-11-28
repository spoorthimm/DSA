
public class MoveZeros {
    public static void move(int[] arr){
        int idx=0;
        for(int n:arr) if(n!=0) arr[idx++]=n;
        while(idx<arr.length) arr[idx++]=0;
    }
}
