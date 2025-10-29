package JAVATest;

public class repatedte {
    public static void main(String[]args)
    {
String a = "abcsfasdjsndsjdnjeijcrcsnkc dkfwkdkdgei fwejifjwei wiiwjfij  wifjweijfiw sfdjv";
a= a.replaceAll(" ","");
while(!a.isEmpty())
{
    char c = a.charAt(0);
    int ww = (a.replaceAll(String.valueOf(c), "")).length();
    System.out.println("count : "+ String.valueOf(c)+" number : "+ (a.length()-ww));
    a= a.replaceAll(String.valueOf(c),"");
}
    }
}
