import java.io.*;
class Q25Total
{
    public static void main(String args[])   throws IOException
    {
        int a[][],n,j,i,m,s,gt=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of rows");       
        n=Integer.parseInt(in.readLine());
                System.out.println("Enter the no. of columns");       
        m=Integer.parseInt(in.readLine());
        a=new int[n][m];
        System.out.println("Enter the numbers");
        for( i=0;i<n;i++)
        for( j=0;j<m;j++)
        a[i][j]=Integer.parseInt(in.readLine());
        for( i=0;i<n;i++)
        {   for( j=0;j<m;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        for( i=0;i<n;i++)
        {   s=0;
            for( j=0;j<m;j++)
            s+=a[i][j];
            gt+=s;
            System.out.println("Row "+(i+1)+" total="+s);
        }
        for( j=0;j<m;j++)
        {   s=0;
            for( i=0;i<n;i++)
            s+=a[i][j];
            gt+=s;
            System.out.println("Column "+(j+1)+" total="+s);
        }
            System.out.println("Grand Total="+gt);
}
}

