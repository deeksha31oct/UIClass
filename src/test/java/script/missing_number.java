package script;

public class missing_number {
    public static void main(String[]args) {
        int []a = {2, 6, 9, 11, 15, 18};
        for(int i =0;i<a.length;i++)
        {
            int k = i+1;
            if(k<a.length && a[i]!=a[k])
            {
                for(int j = a[i]+1;j<a[k];j++)
                {
                    System.out.print(" "+j+" ");
                }
            }
        }
    }}
