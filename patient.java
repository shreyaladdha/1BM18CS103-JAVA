import java.util.*;
class patient
{
    public static void main(String args[])
    {
    int pt_id[]=new int[10];
    int pt_age[]=new int[10];
    String pt_name[]=new String[10];
    String doc[]=new String[10];
    int n;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of patients.");
    n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter patient "+(i+1)+"id, name, age,doc");
        pt_id[i]=sc.nextInt();
        pt_name[i]=sc.next();
        pt_age[i]=sc.nextInt();
        doc[i]=sc.next();
        
    }
    System.out.println("\n\n");
    System.out.println("Enter patient id");
    int id=sc.nextInt();
    int pos=0;
    for(int i=0;i<n;i++)
    {
        if(id==pt_id[i])
        {pos=i;
            break;
        }
          
    }
    System.out.println("DETAILS OF PATIENT");
    System.out.println("NAME: "+pt_name[pos]+"\n"+"age: "+pt_age[pos]+"\n"+"doctor: "+doc[pos]);
    System.out.println("\n\n");
    System.out.println("Enter doctor name");
    String doctor=sc.next();
    System.out.println("Patients treated by :"+doctor);
    for(int i=0;i<n;i++)
    {
        if(doctor.equals(doc[i]))
        System.out.println(pt_name[i]);
    }
}
}

        
        