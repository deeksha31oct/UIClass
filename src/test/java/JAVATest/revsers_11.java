package JAVATest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class revsers_11{
    public static void main(String[]args)
{
    String a ="nh nhi nhi";
    String v = "";
   for(int i = a.length()-1;i>=0;i--)
   {
       v+=a.charAt(i);
   }
    System.out.print("reverse : "+ v);
}}

