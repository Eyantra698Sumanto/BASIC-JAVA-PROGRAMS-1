import java.io.*;
class Q23Sort
{
    public static void main(String args[])   throws IOException
    {
        int a[],b[],c[],n;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
        Q23Sort ob=new Q23Sort();
        ob.AscenSort(a);
        
         System.out.println("The sorted array in ascending order is:");
         for(int i=0;i<n;i++)
          System.out.println(a[i]);
          ob.DescenSort(a);
         System.out.println("The sorted array in descending order is:");
         for(int i=0;i<n;i++)
          System.out.println(a[i]);
        
}
void AscenSort(int a[])
{int t;
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        
    }//return a;
}
void DescenSort(int a[])
{int t;
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]<a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        
    }
}
}

