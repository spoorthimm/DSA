
public class FirstNonRepeatingCharacter{
    public static char find(String s){
        int[] f=new int[256];
        for(char c: s.toCharArray()) f[c]++;
        for(char c: s.toCharArray()) if(f[c]==1) return c;
        return '-';
    }
}
