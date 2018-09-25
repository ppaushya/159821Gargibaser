package org.cap.demo;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		int a=2,b=1,num;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter Number");
		num=s.nextInt();
		
		for(int i=1;i<num;i+=6)
		{
			
			for(int l=1;l<=3;l++)
			{
				if(b>=num)
					System.exit(0);
			System.out.print(b+" ");
			b+=2;					
			}	
			
			for(int j=1;j<=3;j++)
				{
				if(a>=num)
					System.exit(1);
					System.out.print(a+" ");
					a+=2;	
				}
				
			


	}

}}
