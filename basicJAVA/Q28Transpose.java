
import java.io.*;
class Q28Transpose
{
    public static void main(String args[])   throws IOException
    {
        int a[][],b[][],c[][],m,n,i,j;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of row and column");
        m=Integer.parseInt(in.readLine());
        n=Integer.parseInt(in.readLine());
        a=new int[n][m];
        b=new int[m][n];
        System.out.println("Enter the numbers of matrix ");
        for( i=0;i<n;i++)
        {for( j=0;j<m;j++)
        a[i][j]=Integer.parseInt(in.readLine());
    }
        System.out.println("Matrix  is:");
        for( i=0;i<n;i++)
        {   for( j=0;j<m;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }

        for( i=0;i<n;i++)
           for( j=0;j<m;j++)
            b[j][i]=a[i][j];
        
        System.out.println("The transpose is:");
        for( i=0;i<m;i++)
        {   for( j=0;j<n;j++)
            System.out.print(b[i][j]+" ");
            System.out.println();
        }

    }}

