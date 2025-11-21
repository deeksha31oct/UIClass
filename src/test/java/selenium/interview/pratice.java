package selenium.interview;

public class pratice {
    public static  void main (String[]args)
    {
        String a = "automative rell for maisson chaeck now teryrf fgbnhfgmjhbdfbhhfg cvnfg";
      a = a.replaceAll(" ","");
      while(!a.isEmpty())
      {
       char c = a.charAt(0);
       int ww = (a.replaceAll(String.valueOf(c),"")).length();
          System.out.println("counting :"+ String.valueOf(c)+" size : "+(a.length()-ww));
          a= a.replaceAll(String.valueOf(c),"");

      }
    }

}
