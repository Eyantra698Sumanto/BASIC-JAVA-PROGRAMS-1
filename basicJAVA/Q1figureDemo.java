import java.util.Scanner;
class Area_Peri
{   double a,area,perimeter;
    Area_Peri()
    {   Scanner s=new Scanner(System.in);
        System.out.println("Enter a");
        a=s.nextDouble();
    }
    void display()
    {
        
        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);
    }
}
class Circle extends Area_Peri
{   Circle()
    {
        super();
    }
    void cal()
    {   
        area=3.14*a*a;
        perimeter=3.14*a*2;
        display();
    }
}
class Triangle extends Area_Peri
{     double b,c;  
    Scanner s=new Scanner(System.in);
     Triangle()
    {
        super();
    }
    Triangle(int a)
    {
        super();
        
         System.out.println("Enter b");
        b=s.nextDouble();
    }
    Triangle(int a,int a1)
    {
        super();
         System.out.println("Enter b and c");
        b=s.nextDouble();
        c=s.nextDouble();
    }
}
class Equi_Triangle extends Triangle
{
       Equi_Triangle()
       {
           super();
        }
        void cal()
        {
            area=1.732*a*a/4;
            perimeter=3*a;
            display();
}}
class Iso_Triangle extends Triangle
{
       Iso_Triangle()
       {
           super(0);
        }
        void cal()
        {
            area=0.5*b*Math.sqrt(a*a-b*b/4);
            perimeter=2*a+b;
            display();
}}
class Sca_Triangle extends Triangle
{
      Sca_Triangle()
       {
           super(0,0);
        }
        void cal()
        {   double s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            perimeter=a+b+c;
            display();
}}
public class Q1figureDemo
{public static void main(String args[])
{   int ch;
    System.out.println("Enter your choice:1.circle 2.equi triangle 3.iso triangle 4.sca triangle");
    Scanner sc=new Scanner(System.in);
     ch=sc.nextInt();
     switch(ch)
     {
         case 1:
    Circle c=new Circle();
    c.cal();
    break;
    case 4:
    Sca_Triangle s=new Sca_Triangle();
    s.cal();
    break;
    case 2:
    Equi_Triangle e=new Equi_Triangle();
     e.cal();
     break;
    case 3:
    Iso_Triangle i=new Iso_Triangle();
    i.cal();
    break;
    default:
    System.out.println("Wrong choice");
}}}
    
       