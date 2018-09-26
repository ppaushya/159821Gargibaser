package org.cap.demo;
import java.util.Scanner;
public class Ques4 {
	public void printsmall(int[][] arr,int[] rowsmall,int r,int c)
	{
	for(int i=0;i<r;i++)
	{
	for(int j=0;j<c;j++)
	{
	rowsmall[i]=arr[i][j]+rowsmall[i];
	}
	}
	int min=rowsmall[0];
	for(int i=0;i<r-1;i++)
	{
	if(rowsmall[i]>rowsmall[i+1])
	{
	min=rowsmall[i+1];
	}
	}
	for(int i=0;i<r;i++)
	{
	if(min==rowsmall[i])
	{
	for(int j=0;j<c;j++)
	{
	System.out.println(arr[i][j]);
	}
	}
	}
	}

	public void getelements(int[][] arr,int r,int c)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements");

	for(int i=0;i<r;i++)
	{
	for(int j=0;j<c;j++)
	{
	arr[i][j]=sc.nextInt();
	}
	}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Ques4 t=new Ques4();
	System.out.println("Enter the size of matrix");
	Scanner sc=new Scanner(System.in);

	int r=sc.nextInt();
	int c=sc.nextInt();

	int[] rowsmall=new int[r];

	int[][] arr=new int[r][c];
	t.getelements(arr,r,c);
	t.printsmall(arr,rowsmall,r,c);
	}

	}



