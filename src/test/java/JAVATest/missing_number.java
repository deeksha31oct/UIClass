package JAVATest;

public class missing_number {
    public static void main(String[]args)
    {
        int a[] = {2,3,4,6,3,656,232,123};
int max = a[0],min = a[0];
for(int ger:a) {
    if (ger > max) max = ger;
    if (ger < min) min = ger;
}
     System.out.println("maximum :"+ max+" "+ "minimum : "+min);
 }

      }


