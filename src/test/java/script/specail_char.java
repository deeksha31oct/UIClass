package script;

public class specail_char {
    public static void main (String[]args)
    {
        String a = "dee#$% kash567!$#$@#$@";
   String t = "";
   for(int i = 0;i<a.length();i++)
   {
       char c = a.charAt(i);
       if(!Character.isLetterOrDigit(c))
       {
           t +=c;
       }
   }
        System.out.println(t);
    }
}
