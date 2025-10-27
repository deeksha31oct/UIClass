package script;

public class missing_number_array {
    public static void main(String[]args)
    {
int a []= {2,4,8,12,24};
for(int i =0 ;i<a.length;i++)
{
    int j = i+1;
    if(j<a.length && a[i]!=a[j])
    {
        for(int k= a[i]+1;k<a[j];k++)
        {
            System.out.print(" "+k+" ");
        }
    }
}
    }
}
