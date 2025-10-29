package JAVATest;

public class count_charceter {
    public static void main(String[]args)
    {
        String a = "one two three four five ";
        while(!a.isEmpty())
        {
        char ct = a.charAt(0);
        int data = a.replaceAll(String.valueOf(ct),"").length();
        if(ct==' ')
        {
            a= a.replaceFirst(" ","");
            continue;
        }
        System.out.println("count : "+String.valueOf(ct)+" repeat: "+ (a.length()-data) );
        a = a.replaceAll(String.valueOf(ct),"");
    }
}}
