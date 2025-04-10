package test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class Countclass {
    public static void main(String[]args)
    {
        String s = "fir se check kar rhi hu ";
        HashMap<Character,Integer> ct = new HashMap<>();
        for(Character c : s.toCharArray())
        {
            if(ct.containsKey(c))
            {
                ct.put(c,ct.get(c)+1);
        }
        else {
            ct.put(c,1);
            }}
        System.out.println(ct);
    }
}
