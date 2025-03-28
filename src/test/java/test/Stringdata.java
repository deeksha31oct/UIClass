package test;

public class Stringdata
{
    public static void main (String[]args)
    {
        String s = "pratice with udemy for automation in selenium";
     String [] sp =    s.split(" ");
     System.out.println(sp[0]);
       // System.out.println(s);
        for(int i = 0 ;i<s.length();i++)
        {

            System.out.println(s.charAt(i));
        }
        for(int i = s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
