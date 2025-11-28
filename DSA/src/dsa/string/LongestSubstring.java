
import java.util.*;
public class LongestSubstring{
    public static int lengthOfLongestSubstring(String s){
        int l=0,res=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(map.containsKey(c) && map.get(c)>=l)
                l=map.get(c)+1;
            map.put(c,r);
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
