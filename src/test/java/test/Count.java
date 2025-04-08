package test;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String s = "welcometonewhyderabad";
        Map<Character, Integer> cc = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (cc.containsKey(c)) {
                cc.put(c, cc.get(c) + 1);
            } else {
                cc.put(c, 1);
            }
        }

        System.out.println(cc);
    }
}

