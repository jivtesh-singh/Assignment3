import java.util.*;
public class question4
{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= myobj.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.print(n+" ");
            } else if (n%2!=0)
            {
                n=(n*3)+1;
                System.out.print(n+" ");
            }
        }
    }
}
