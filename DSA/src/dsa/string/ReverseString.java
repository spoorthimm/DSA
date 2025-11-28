
public class ReverseString{
    public static String reverse(String s){
        char[] c=s.toCharArray();
        int l=0,r=c.length-1;
        while(l<r){
            char t=c[l]; c[l]=c[r]; c[r]=t;
            l++; r--;
        }
        return new String(c);
    }
}
