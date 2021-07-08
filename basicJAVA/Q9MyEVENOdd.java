import java.io.*;
class Even implements Runnable
{
    Even()
    {
        super();
    }
     public void run()
        {  
            for(long i=2;i<=30;i+=2)
            {
              System.out.println("EVEN NUMBERS:" +i);
            }
         }   
}  

 
class Odd implements Runnable
{
    Odd()
    {
        super();
    }
     public void run()
        {  
            for(long i=3;i<=30;i+=2)
            {
              System.out.println("ODD NUMBERS:" +i);
            try
            {
                 if(i==15)
                {
                    System.out.println("Thread Odd  is put into sleep.");
                    Thread.sleep(5000);
                    System.out.println("Thread Odd is active.");
                }
            }
             catch(InterruptedException e)
            {
                System.out.println("Error : " + e);
            }
         }  } 
} 
 
public class Q9MyEVENOdd {
 
    public static void main(String[] args) throws IOException
    {
        Thread ct=Thread.currentThread();
                
        System.out.println("Main thread name : "+ct.getName()); 
             Odd f=new Odd();  
        Thread Odd=new Thread(f,"ODD NUMBER");
            Odd.start();
        System.out.println("Thread "+ Odd.getName() + " started.");
   

        Even fa=new Even();
        Thread Even=new Thread(fa,"EVEN NUMBER");
        Even.start();   
        System.out.println("Thread "+ Even.getName() +" started."); 

    

    }
}