package application;
import java.util.Scanner;

public class Main {
	
	
	
	 int num = 121;
		int temp=num;
		int rev=0,rem;
		{
		 
		while(temp!=0)
		{
			rem=temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		
		 {
				if(num==rev)
				{ 
					System.out.println(num +"is palindrome number");
				
				}
				else
				{
					System.out.println(num +"is not a palindrome number");
				}
		 }
		 
		}
		 
		 	public void checkpalindrome() {
						
					}
		
				int i=1,j=4;
			{
			for(i=1;i<=4;i++)
			{
				for(j=4;j>=i;j--)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
			}
			
			public void printpattern() { 
					
				}
					
				int n1=7;
					boolean prime = true;
					{
					for(int r=2;r<n1;r++)
					{
						if(n1%r==0)
						{prime = false;
						break;
						}
						
					System.out.println("prime");
					
					}
						
					}
						
			public void checkprime() {
					
				}
					

			Scanner sc = new Scanner(System.in);
				{
				System.out.println("enter the number of numbers you want to print");
					int count = sc.nextInt();
					int num1 = 1;
					int num2 = 1;
					System.out.print(num1+","+num2+",");
					for(int t=0;t<count-2;t++) {
						int sum = num1+num2;
						System.out.print(sum+",");
						num1 = num2;
						num2 = sum;
								
					}
					System.out.println(".......");
					
					}
				
          public void printfibanocci() { 
							
						}
						
		public static void main(String[] args) { 
			Scanner sc=new Scanner(System.in);
		Main obj=new Main();
		int choice;
		 choice=sc.nextInt();
		
		
			
		
		do
		{
			
			
		
			
	System.out.println("enter your choice from below list.\n");
	System.out.println("1.palindrome number\n");
	System.out.println("2.print pattern\n");
	System.out.println("3.prime number\n"); 
	System.out.println("4.fibanocci\n");
	System.out.println("->enter 0 to exit\n");
	System.out.println();
		 
		 switch(choice) {
		 case 0:
		 choice=0;
		 
		 break;
		 case 1:{
			 obj.checkpalindrome();
			 System.out.println("checkpalindrome");
			 
		 }
		 break;
		 case 2:{
			 obj.printpattern();
			 System.out.println("printpattern");
		 }
		 break;
		 case 3:
		 {
			 obj.checkprime();
			 System.out.println("checkprime");
		 }
		 break;
		 case 4:{
			 obj.printfibanocci();
			 System.out.println("fibanocci");
		 }
		 break;
		 default :{

		 
			 System.out.println("invalid choice");
		 }
		 }
		}
			 
		 
		 
		 
		 while(choice!=0);
		 {
		 
		 System.out.println("exited successfully!!!");
		 }
		 
		 sc.close();
		 }
		}
		
		
		
	
		
		
						
				
				
		
		 
		
		
			 
		 
			 
			 
			 
		 
		 
		 
		 
		

	


