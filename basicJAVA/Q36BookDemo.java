 import Book.*;
import java.util.*;
class Q36BookDemo
{
    public static void main(String args[])
    {int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of books");
        n=in.nextInt();
        Book_details s[]=new Book_details[5];
        for(int i=0;i<n;i++){
    System.out.println("Enter Book "+(i+1)+" details");
       s[i]=new Book_details();
    }
      System.out.println("Book name Author Price Year of Publication");
      for(int i=0;i<n;i++)
       s[i].display();
    }}
