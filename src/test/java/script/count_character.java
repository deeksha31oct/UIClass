package script;

public class count_character {
public static void main(String[]args)
{
    String a ="one two three four five six and seven";
    while(!a.isEmpty())
    {
char c= a.charAt(0);
int it = a.replaceAll(String.valueOf(c),"").length();
if(c==' ')
{
    a = a.replaceFirst(" ","");
    continue;
}
        System.out.println("counting: "+ String.valueOf(c)+" size : "+ (a.length()-it));
a=a.replaceAll(String.valueOf(c),"");
    }

}
}
