package JAVATest;

import java.util.ArrayList;

public class fabnacoo_serise {
    public static void main(String[]args)
    {
        int a = 10;
        ArrayList<Integer>q = new ArrayList<>();
        q.add(0);
        q.add(1);
        for(int i =2;i<a;i++)
        {
            int to = q.get(i-1)+q.get(i-2);
            q.add(to);
        }
        System.out.print(q);
    }
}
