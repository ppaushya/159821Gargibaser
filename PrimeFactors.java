import java.util.Scanner;
public class PrimeFactors {
	
		Scanner sc=new Scanner(System.in);
		
		int n;
		public void getNum()
		{
			n=sc.nextInt();
		}public static void main(String[] args) {
			PrimeFactors p=new PrimeFactors();
			System.out.println("Enter the number");
			p.getNum();
			System.out.println("Following are prime factors of "+p.n);
			int num=p.n;
			for(int i=2;i<(p.n);i++)
			{
				while(num%i==0)
				{
					System.out.print(i+" ");
					num=num/i;
				}
			}

		}

	} 

