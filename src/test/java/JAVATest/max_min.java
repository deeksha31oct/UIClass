package JAVATest;

public class max_min {
    public static void main(String[]args)
    {
        int a[]= {2,44,76,21,9,12,433};

        int max = a[0],min = a[0];
        for(int ct:a)
        {
            if(ct>max)max= ct ;
            if(ct<min)min=ct;
        }
        System.out.println("max:"+ max+" "+ "min: "+ min);

    }
}
