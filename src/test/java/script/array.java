package script;

import java.util.Arrays;
import java.util.Collections;

public class array {
    public static void main(String[]args)
    {
        Integer a[] = {14,24,4545,4354,45634,2,24,43,6};
        Arrays.sort(a);
        System.out.println(a);
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(a);

    }
}
