
public class StringFrequency{
    public static int[] freq(String s){
        int[] f=new int[256];
        for(char c:s.toCharArray()) f[c]++;
        return f;
    }
}
