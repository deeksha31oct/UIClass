package script;

public class special {
    public static void main(String[]args)
    {
        String sp = "dkjigj#$%^212143454";
        String w = "";
        for(int i =0;i<sp.length();i++)
        {
            char c= sp.charAt(i);
            if(Character.isLowerCase(c))
            {
               w+=c;
            }

        }
        System.out.println(w);
    }
}
