package JAVATest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class miss {
    public static  void main (String[]args)
    {
      Integer []a = {2,35,67,12,7,324,78,723,4};
        Arrays.sort(a);
        System.out.println(a);

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a);
    }
}
