package test;

import java.util.HashMap;
import java.util.Map;

public class RepeartCount {
    public static void main(String [] args)
    {
        String s = "need to more effort";
     HashMap<Character , Integer> rep = new HashMap<>();
        for(Character l:s.toCharArray())
        {
rep.put(l,rep.getOrDefault(l,0)+1);
        }
System.out.println(rep);
    }
}
