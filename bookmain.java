import java.util.*;	
class bookmain
	{
		public static void main(String args[])
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no. of books.");
			n=sc.nextInt();
			book b[]=new book[n];
			for(int i=0;i<n;i++)
			{
				b[i]=new book();
				b[i].setdata();
				System.out.println("**********BOOK DETAILS OF : "+(i+1)+"*************");
				System.out.println(b[i]);
			}
		}
	}
class book
{
	String name,author;
	int price,page;
	book()
	{
		name="";
		author="";
		price=0;
		page=0;
	}
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and author");
		name=sc.nextLine();
		author=sc.nextLine();
		System.out.println("Enter price and no. of pages");
		price=sc.nextInt();
		page=sc.nextInt();
	}
	public String toString()
	{
		return "name of book:\t"+name+"\n"+"Author name:\t"+author+"\n"+"Price:\t\t"+price+"\n"+"number of pages:"+page+"\n";
	}
}


		
