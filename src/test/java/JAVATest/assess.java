package JAVATest;

import java.util.Arrays;
import java.util.Collections;

public class assess {
    public static void main(String[]args)
    {
        Integer []a= {133,5,334,55,343,576,324};
        System.out.println("origina "+ a);
        Arrays.sort(a);
        System.out.println("asesnding :"+Arrays.toString(a));


        Arrays.sort(a,Collections.reverseOrder());

        System.out.println("desesing : "+ Arrays.toString(a));

    }
}
