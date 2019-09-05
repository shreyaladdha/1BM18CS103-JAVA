import java.util.*;
class quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b and c.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(b*b)-(4*a*c);
        if(d<0)
        System.out.println("There are no real solutions");
         if(d==0)
        {
            double x1=(-b)/(2*a);
           System.out.println("roots are equal : "+x1);
        }
        else
        {
            double x1=((-b)+Math.sqrt(d))/(2*a);
            double x2=((-b)-Math.sqrt(d))/(2*a);
            System.out.println("roots are : "+x1+" and "+x2);
        }
    }
}