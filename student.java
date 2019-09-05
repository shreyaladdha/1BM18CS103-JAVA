import java.util.*;
class student
{
String name,usn;
		int n;
		
		double marks[]=new double[10];
		double credits[]=new double[10];
		double grade[]=new double[10];
		double sgpa,tot_credits;
	public static void main(String args[])
	{
		
		student ob=new student();
		ob.accept();
		ob.calc();
		ob.display();
	}
 void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and usn :");
		name=sc.next();
		usn=sc.next();
		System.out.println("Enter the number of subjects:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter marks of subject:"+i);
			marks[i]=sc.nextDouble();
		}
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter credits of subject:"+i);
			credits[i]=sc.nextDouble();
			tot_credits=tot_credits+credits[i];
		}
	}
	void calc()
	{
	for(int i=1;i<=n;i++)
	{
		if(marks[i]>=90)
		grade[i]=10;
		else if(marks[i]>=75&&marks[i]<90)
		grade[i]=9;
		else if(marks[i]>=60&&marks[i]<75)
		grade[i]=8;
		else if(marks[i]>=50&&marks[i]<60)
		grade[i]=7;
		else if(marks[i]>=40&&marks[i]<50)
		grade[i]=7;
		else
		grade[i]=0;
		sgpa=sgpa+credits[i]*grade[i];
	}
	sgpa=sgpa/tot_credits;
	}
	 void display()
	{
	System.out.println("------------result------------");
	System.out.println("name:\t\t"+name);
	System.out.println("USN:\t\t"+usn);
	System.out.print("marks:\t\t");
	for(int i=1;i<=n;i++)
	{
		System.out.print(marks[i]+"  ");
	}
	System.out.println();
	System.out.println();
	System.out.print("credits:\t");
	for(int i=1;i<=n;i++)
	{
	System.out.print(credits[i]+"  ");
	}
	System.out.println();
	System.out.println();
	System.out.print("grades:\t\t");
	for(int i=1;i<=n;i++)
	{
	System.out.print(grade[i]+"  ");
	}
	System.out.println();
	System.out.println();
	System.out.println("SGPA IS :\t"+sgpa);
	}
}





