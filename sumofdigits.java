package org.cap.demo;
import java.util.Scanner;
public class sumofdigits {
	
			private static Scanner add;
			
			public static void main(String[] args) {
				int Number, Reminder, Sum = 0;
				add = new Scanner(System.in);		
				System.out.println("Please Enter any Number: ");
				Number = add.nextInt();
				
				while(Number > 0) {
					Reminder = Number % 10;
					Sum = Sum+ Reminder;
					Number = Number / 10;
				}
				System.out.format("Sum of the digits of Given Number = %d", Sum);
			}
		

	}


