package test;

public class rev {
        public static void main(String[]args)
        {
            int []arr= {1,4,6,9};
            int n = arr.length+1;
            int to = n*(n+1)/2;
            int sum = 0 ;
            for(int num:arr){
                sum += num;
            }
            System.out.println("missing:"+ (to-sum));
        }}
