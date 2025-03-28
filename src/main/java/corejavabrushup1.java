public class corejavabrushup1
{
public static void main (String[]args)
{
    int []at = {2,3,6,5,77,86,12};
    for(Integer i :at)
    {
        if( at[i] % 2==0)
        {
        System.out.println(at[i]);
        break;
    }
        else
        {
            System.out.println(at[i] + "is not multiple of 2");
        }
    }
}
}
