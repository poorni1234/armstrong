import java.util.*;
import java.lang.*;
public class arml
{
  public static void main(String args[])
  {
           int n,a;
           int f;
           int sum=0;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           f=n;
           while(n>0)
           {
               a=n%10;
               sum=sum+a*a*a;
               n=n/10;
           }
           if(f==sum)
           {
               System.out.println("YES");
           }
        else
        {
               System.out.println("NO");
            }
}
}
