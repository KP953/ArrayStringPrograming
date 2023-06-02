package Programs;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		printElement();
		forLoop();
		reverseArray();
		printLargestElement();
		printSmallestElement();
		largestSecondLargest();
		thirdLargest();
		triplet1();
	}

	public static void printElement() {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println("Printing the elements of above array");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a);
		System.out.println(a.length);
		System.out.println("====================================================");
	}

	public static void forLoop() {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println("Printing the elements of above array using for loop");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("================================================================");
	}

	public static void reverseArray() {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println("Printing the elements of above array in reverse order");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("=================================================================");

	}

	public static void printLargestElement() {
		int[] a = { 10, 34, 56, 87, 93 };
		System.out.println("Printing the  largest elements of above array");
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large);
		
		System.out.println("=================================================================");

	}
	public static void printSmallestElement() {
		int[] a = { 78, 34, 56, 87, 93 };
		System.out.println("Printing the  smallest elements of above array");
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small) {
			small=a[i];
			}
		}
		System.out.println(small);
		System.out.println("=================================================================");

	}
	public static void largestSecondLargest() {
		int[] a = { 78, 34, 56, 87, 93 };
		System.out.println("Printing the  largest and second largest elements of above array");
		int max=0;
		int secmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>secmax)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println("The largest number :"+ max);
		System.out.println("The second largest number :"+ secmax);
		System.out.println("========================================================================");

	}
	public static void thirdLargest() {
		int[] a = { 78, 34, 56, 87, 93 };
		System.out.println("Printing the  third second largest elements of above array");
        int max=0;
        int secmax=0;
        int thirdmax=a[0];
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]>max)
        	{
        		thirdmax=secmax;
        		secmax=max;
        		max=a[i];
        	}
        	else if(a[i]>secmax && a[i]!=max)
        	{
        		thirdmax=secmax;
        		secmax=a[i];
        	}
        	else if(a[i]>thirdmax && a[i]!=secmax && a[i]!=max)
        	{
        		thirdmax=a[i];
        	}
        	   	
        }
        System.out.println(thirdmax);
        System.out.println("==============================================================   ");
	}
	
	public static void triplet1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("Enter the sum of triplet :");
		int sum = sc.nextInt();
		int s[] = { 1, 2, 3, 4, 5};
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				for (int k = j + 1; k < s.length; k++) {
					if (count < 1) {
						if (s[i] + s[j] == sum) {
							System.out.println(s[i] + " ");
							count++;
						}
					}
				}
			}
		}
	
}
}