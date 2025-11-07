package script;

public class count {
    public static void main(String[]args)
    {
        String a= "twotabsearchtextbox";
        a.replaceAll(" ","");
        System.out.println(a);
        while(!a.isEmpty())
        {
            char c= a.charAt(0);
            int ww= a.replaceAll(String.valueOf(c),"").length();
            System.out.println("count : "+ String.valueOf(c)+ "size : "+ (a.length()-ww));
          a=   a.replaceAll(String.valueOf(c),"");
        }
    }
}
