import java.util.Scanner;
class Q38ComplexDemo
{
    public static void main(String args[])
    {
         Complex n1=new   Complex();
         Complex n2=new   Complex();
          Complex res=new   Complex(0);
        res=n1.add(n2);
        System.out.println("Addition:"+res.real+"+"+res.img+"i");
        res=n1.sub(n2);
        System.out.println("Substraction:"+res.real+"+"+res.img+"i");
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

}

