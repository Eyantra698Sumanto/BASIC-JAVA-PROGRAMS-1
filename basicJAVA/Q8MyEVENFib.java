import java.io.*;
class Even implements Runnable
{
    Even()
    {
        super();
    }
     public void run()
        {  long  f=1;
            for(long i=2;i<=30;i+=2)
            {
              System.out.println("EVEN NUMBERS:" +i);
            }
         }   
}  

 
class Fib implements Runnable
{
    long a,b,c,n;
    Fib()throws IOException
    {
        a=c=n=0;
        b=1;
          
    }
    public void run()
    {
        while(a<=100)
        {
            System.out.println(n+"th" +" Fib no: = "+a);
            c=a+b;
            a=b;
            b=c;
            try
            {
                if(n==5)
                {
System.out.println("Thread fibonacci is put into sleep.");
                    Thread.sleep(5000);
                }
                
            }
            catch(InterruptedException e)
            {
                System.out.println("Error : " + e);
            }n++;
        }   
    }
}
 
public class Q8MyEVENFib {
 
    public static void main(String[] args) throws IOException
    {
        Thread ct=Thread.currentThread();
        System.out.println("Main thread name : "+ct.getName()); 
        Even fa=new Even();
        Fib f=new Fib();
        
        
        Thread Even=new Thread(fa,"EVEN NUMBER");
        Even.start();   
        System.out.println("Thread "+ Even.getName() +" started."); 
        Thread fib=new Thread(f,"fibonacci");
            fib.start();
        System.out.println("Thread "+ fib.getName() + " started.");
    

    }
}