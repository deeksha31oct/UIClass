package script;

public class reverse_second {
    public static void main(String[]args)
    {
        String a   = "reverse string with incrrasing for loop";
       String r = "";
       char c ;
       for(int i = 0;i<a.length();i++)
       {
           c =a.charAt(i);
           r = c+r;
       }
        System.out.println("reverse: "+ r);
    }
}
