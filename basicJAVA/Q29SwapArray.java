import java.io.*;
class Q29SwapArray
{
    public static void main(String args[])   throws IOException
    {
        int a[],b[],n,m,t,c;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements of array 1");
        m=Integer.parseInt(in.readLine());
        System.out.println("Enter the number of elements of array 2");
        n=Integer.parseInt(in.readLine());
        if(m>n)
        c=m;
        else
        c=n;
        a=new int[c];
        b=new int[c];
        System.out.println("Enter the numbers of array 1");
        for(int i=0;i<m;i++)
        a[i]=Integer.parseInt(in.readLine());
        System.out.println("Enter the numbers of array 2");
        for(int i=0;i<n;i++)
        b[i]=Integer.parseInt(in.readLine());
        System.out.println("Before Swaping:");
                System.out.println("Array 1:");
                for(int i=0;i<m;i++)
                System.out.print(a[i]+" ");
                System.out.println();
                System.out.println("Array 2:");
                for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
                System.out.println();
         for(int i=0;i<c;i++)
          {
              t=a[i];
              a[i]=b[i];
              b[i]=t;
            }
                System.out.println("After Swaping:");
                System.out.println("Array 1:");
                for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
                System.out.println();
                System.out.println("Array 2:");
                for(int i=0;i<m;i++)
                System.out.print(b[i]+" ");
                System.out.println();
}}