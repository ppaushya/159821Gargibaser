package org.cap.demo;

public class Armstrong {

		public static void main(String[] arg)
		{
		int i=1,arm;
		System.out.println("Armstrong number from 1 to 1000");
		while(i<=1000)
		{
		arm=armstrongOrNot(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}
	}

