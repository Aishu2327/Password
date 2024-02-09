import java.util.*;

public class passgen
{
    public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
        int s;
        System.out.println("Enter the length of the password");
        s=sc.nextInt();
        String u="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String l="abcdefghijklmnopqrstuvwxyz";
        String n="0123456789";
        String sp="_&$#@^";
        String c=u+l+n+sp;
        char[] pass=new char[s];
        Random r=new Random();
        for(int i=0;i<s;i++)
        {
            pass[i]=c.charAt(r.nextInt(c.length()));
        }
        System.out.println("Password is "+new String(pass));
    }
}