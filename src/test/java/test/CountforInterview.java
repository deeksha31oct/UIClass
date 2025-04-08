package test;

import java.util.HashMap;

public class CountforInterview {
    public static void main(String[]args)
    {
        String str = "IcanDOthateasilyneedmoreconcentration";
        HashMap<Character , Integer> hs= new HashMap<>();
        for(char ar : str.toCharArray())
        {
            hs.put(ar , hs.getOrDefault(ar , 0)+1);
        }
        System.out.println(hs);
    }
}
