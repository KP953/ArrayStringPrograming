package String;

import java.util.Scanner;

public class Stringi {

	public static void main(String[] args) {
		
		lexoGraphical();
		triplet();

	}
	
	
	public static void lexoGraphical()
	{
		String [] a = { "Javed sir","Bikash sir","Nagesh sir","javed"};
		String temp;
		for(int i=0;i<a.length;i++) 
		{
			for (int j = i+1; j < a.length; j++) {
				
				if(a[1].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
			
		}
			
				
			
		}
	
	public static void triplet() {
		int[] a= {1,2,3,4,5,6,7,8,9};
		 int count=0;
		 for (int i = 0; i < a.length; i++) {
			 for (int j = i+1; j < a.length; j++) {
				 for (int k = j+1; k < a.length; k++) {
					 if(a[i]+a[j]==a[k])
					 {
						 count++;
						 System.out.println(a[i]+" "+a[j]+" "+a[k]);
					 }
					
				}
				
			}
			
		}
		 System.out.println("Total number of triplet :"+count);
	}
			

}
