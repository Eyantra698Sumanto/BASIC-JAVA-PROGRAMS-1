import java.io.*;
class Q39SearchArr
{
    public static void main(String args[])throws IOException
    { 
        int d[],c=0,j=0,n;char p;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        n=Integer.parseInt(in.readLine());
        d=new int[n];
       System.out.println("Enter the elements");
       for(int i=0;i<n;i++)
        {   
            d[i]=Integer.parseInt(in.readLine());
            
        }
        System.out.println("Enter the element to be searched");
        c=Integer.parseInt(in.readLine());
       for(int i=0;i<n;i++)
        {   
            if(d[i]==c)
            {j=i+1;
            }
            
        }
        if(j==0)
        System.out.println("Element not present");
        else
        System.out.println("Element present at "+j);
    }}