import java.util.*;
class Person
{ String Name,Code;
 Person()
 { 
Scanner sc=new Scanner(System.in);
     System.out.println("enter name:");
     Name=sc.next();
      System.out.println("enter code:");
     Code=sc.next();  
    }
    void display()
    {System.out.println("Name="+Name);
     System.out.println("Code="+Code);
    }
}
class Account extends Person
{
    double Pay;
    Account()
    {super();
        Scanner sc=new Scanner(System.in);
            System.out.println("enter Payment done:");
     Pay=sc.nextDouble();
    }
    void display()
    {
        super.display();
        System.out.println("Payment="+Pay);
    }
}
class Admin extends Account
{
    int Exp;
    Admin()
    {
        super();
                Scanner sc=new Scanner(System.in);
            System.out.println("enter Experience:");
    Exp=sc.nextInt();
}
void display()
    {
        super.display();
        System.out.println("Experience="+Exp);
    }}
   public  class Q10NetworkDemo
    {
        public static void main(String args[])
        {
            Admin ob=new Admin();
            ob.display();
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
