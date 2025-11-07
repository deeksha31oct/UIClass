package script;

public class miss {
    public static void main(String[]args) {
        int[] a = {2, 5, 9, 16};
        for(int i = 0;i<a.length;i++)
        {
            int j = i+1;
            if(j<a.length && a[i]!=a[j])
            {
                for(int k = a[i]+1;k<a[j];k++)
                {
                    System.out.println(k);
                }
            }
        }
    }
}
