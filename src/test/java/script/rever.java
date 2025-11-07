package script;

import java.util.Arrays;
import java.util.List;

public class rever {
    public static void main(String[]args)
    {
        String ss = "interview he or krna ";
        String r= "";
        for(int i = ss.length()-1;i>0;i--)
        {
            r+=ss.charAt(i);
        }
        System.out.println(r);

        List<Integer>ls= Arrays.asList(2,4,6,76,2132,787,232,678,21);

        //System.out.println(Arrays.sort(ls.toString()));
    }
}
