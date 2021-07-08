import java.util.Scanner;
class Q34ComplexDemo
{
    public static void main(String args[])
    {
         Complex n1=new   Complex();
         Complex n2=new   Complex();
         n2.print(n1);
    }
}
class  Complex
{
    double real,img;
    Complex()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and img part of the Complex number");
        real=s.nextDouble();
        img=s.nextDouble();
    }
    Complex(int a)
    {   real=img=a;
    }
    Complex add(Complex c)
    {
        Complex temp=new Complex(0);
        temp.real=real+c.real;
        temp.img=img+c.img;
        return temp;
    }
    Complex sub(Complex c)
	{
		Complex temp=new Complex(0);
		temp.real=real-c.real;
		temp.img=img-c.img;
		return temp;
	}
	void print(Complex b)
	{Complex res=new   Complex(0);
	            res=add(b);
        System.out.println("Addition:("+res.real+","+res.img+")");
        res=sub(b);
        System.out.println("Substraction:("+res.real+","+res.img+")");
    }
}

