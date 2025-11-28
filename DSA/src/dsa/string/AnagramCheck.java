
import java.util.Arrays;
public class AnagramCheck{
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        char[] x=a.toCharArray(); char[] y=b.toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        return Arrays.equals(x,y);
    }
}
