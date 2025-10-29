package JAVATest;

import java.util.ArrayList;

public class List_even_odd
{
    public static void main(String[]args)
        {
            int a []= {2,4,6,4,5,4,423,535,355,312,12};
            ArrayList <Integer>ev = new ArrayList<>();
ArrayList<Integer>od = new ArrayList<>();
for(int i = 0;i<a.length;i++)
{
    if(a[i]%2==0)
    {
       ev.add(a[i]);
    }
    else {
        od.add(a[i]);
    }
}
            System.out.println("even : "+ ev);
            System.out.println("odd  : "+ od);
        }
        }
