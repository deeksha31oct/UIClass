package script;

public class max_min {
    public static void main(String[]args){
    int  []a ={2922,234,2445,2323434,243545,111111111};
    int mx =a[0],min=a[0];
    for(int check:a)
    {
        if(check>mx)mx=check;
        if(check<min)min=check;
    }
        System.out.println("maximum : "+mx+" "+ "min:"+ min);
}}
