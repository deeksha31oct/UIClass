package script;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Assesnding_desending {
    public static void main(String[]args)
    {
        Integer []a = {10,20 ,30,40,40,50,44,332,439,23218,43232};
        System.out.println("orginal"+ Arrays.toString(a));
        //assessending
        Arrays.sort(a);
        System.out.println("assesnding:"+ Arrays.toString(a));

        //deseing
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("desending: "+ Arrays.toString(a));

    }
}
