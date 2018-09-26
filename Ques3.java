package org.cap.demo;
import java.util.Scanner;
public class Ques3 {
	
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
	public int findSmallest(int[] arr)
	{
	int i;
	for(i=0;i<arr.length-1;i++)
	{
	if((arr[i+1]-arr[i])==1)
	{
	continue;
	}
	else
	{
	return arr[i]+1;
	}
	}
	
	return arr[i]+1;
	}
	public void sorting(int[] arr)
	{
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	        
	System.out.println(findSmallest(arr));

	        
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Ques3 t=new Ques3();
	System.out.println("Enter the size of matrix");
	Scanner sc=new Scanner(System.in);

	int r=sc.nextInt();
	int c=sc.nextInt();



	int[][] arr=new int[r][c];
	t.getelements(arr,r,c);
	for(int i=0;i<r;i++)
	{
	t.sorting(arr[i]);
	}
	}

	}



