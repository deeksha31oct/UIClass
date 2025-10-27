package script;

public class reverse {
    public static void main(String[]args) {
        String a = "reverse string for automation";
        String r = "";
        for(int i = a.length()-1;i>0;i--)
        {
            r += a.charAt(i);
        }
        System.out.println("reverse:"+r);
    }}

