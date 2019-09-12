import java.util.*;
import java.lang.*;
class customer
{
    private int customer_no,qty,price,totalprice;
    private double discount,netprice;
   private String customer_name;
   customer()
   {
   }
  
   void input()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter customer number, name, quantity,price:");
       customer_no=sc.nextInt();
       customer_name=sc.next();
       qty=sc.nextInt();
       price=sc.nextInt();
    }
    void calcdiscount()
    {
        totalprice=price*qty;
        if(totalprice>=50000)
        {discount=(0.25)*totalprice;}
        if(totalprice>=25000&&totalprice<50000)
        {discount=(0.10)*totalprice;}
        netprice=totalprice-discount;
    }
    void show()
    {
        System.out.println("Customer number: "+customer_no+ "\n"+"Customer name: "+customer_name+ "\n"+"quantity: "+qty+ "\n"+"price: "+price+ "\n"+"total price: "+totalprice);
        System.out.println("discount: "+discount+"\n"+"net price: "+ netprice+"\n\n");
    }
}
    
  class customermain
    {
        public static void main(String args[])
        { int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number of customers.");
            n=sc.nextInt();
            customer c=new customer();
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter details of customer "+i);
                c.input();
                c.calcdiscount();
                System.out.println("**************DETAILS OF CUSTOMER "+i+"*****************");
                c.show();
            }
        }
    }