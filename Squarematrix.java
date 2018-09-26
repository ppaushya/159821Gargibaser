package org.cap.demo;
import java.util.Scanner;
public class Squarematrix {
public void getlower(int[][] arr,int r)
{
for(int i=0;i<r;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
}

public void getupper(int[][] arr,int r)
{
System.out.println();

for(int i=0;i<r;i++)
{
int space=i;
while(space>0)
{
System.out.print(" ");
space--;
}
for(int j=i;j<r;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
}
public void getelements(int[][] arr,int r)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");

for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
arr[i][j]=sc.nextInt();
}
}
}
public void printtranspose(int[][] arr,int r)
{
System.out.println();
System.out.println("Transpose is: ");

for(int i = 0; i < r; i++)
    {
          for(int j = 0; j < r; j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
public static void main(String[] args) {
// TODO Auto-generated method stub
Squarematrix t=new Squarematrix();
System.out.println("Enter the size of matrix");
Scanner sc=new Scanner(System.in);

int r=sc.nextInt();
int[][] arr=new int[r][r];
t.getelements(arr, r);
t.getlower(arr,r);
t.getupper(arr, r);
t.printtranspose(arr,r);
}

}