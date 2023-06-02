package String;

import java.util.Arrays;

public class StringProgram1 {
	public static void main(String[] args) {
		String s = "jAvA";
		String r = "pratik";
		String t = "TAHNE";
		String c1 = "cat";
		String c2 = "Act";
		String u = "PeterPARker";
		String g = "i am pratik";
		Convert(s);
		reverse(t);
		palindromeofString(r);
		anagram(c1, c2);
		changeTheCase(u);
		spiltReverse(g);
		removeSpace(g);
		removeAllVowels(g);

	}

	public static void Convert(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String s1 = new String(ch);
		System.out.println("The given string in uppercase: ");
		System.out.println(s1);
		System.out.println("================================================");
	}

	public static void reverse(String t) {
		String rev = "";
		for (int i = t.length() - 1; i >= 0; i--) {
			rev = rev + t.charAt(i);

		}
		System.out.println("The given String in reverse order");
		System.out.println(rev);
		System.out.println("===================================================");

	}

	public static void palindromeofString(String r) {
		String rev = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			rev = rev + r.charAt(i);
		}
		if (rev.equalsIgnoreCase(r)) {
			System.out.println(rev + " The given string is palindrome");
		} else {
			System.out.println(rev + " The given string is not palindrome");
		}
		System.out.println("=========================================================");

	}

	public static void anagram(String c1, String c2) {
		System.out.println("Checking Given Sring is Angarm or not");
		if (c1.length() == c2.length()) {
			c1 = c1.toLowerCase();
			c2 = c2.toLowerCase();
			char[] a = c1.toCharArray();
			char[] b = c2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			String c3 = new String(a);
			String c4 = new String(b);
			if (c3.equalsIgnoreCase(c4)) {
				System.out.println("The given string is anagram");
			} else {
				System.out.println("The given string is not anagram");
			}
		}
		System.out.println("========================================================");

	}

	public static void changeTheCase(String u) {
		char[] ch = u.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String u2 = new String(ch);
		System.out.println("program for uppercase");
		System.out.println(u2);
		System.out.println("===========================================");

	}

	public static void spiltReverse(String g) {
		String[] d = g.split(" ");
		System.out.println("program for spilt and reverse without changing position");

		for (int i = 0; i < d.length; i++) {
			String rev = "";
			String y = d[i];
			for (int j = y.length() - 1; j >= 0; j--) {
				rev = rev + y.charAt(j);
			}
			System.out.print(rev + " ");

		}
		System.out.println();
	
		System.out.println("===========================================");


	}
	public static void removeSpace(String g) {
		char[]ch=g.toCharArray();
		String remove="";
		System.out.println("Remove the spaces");

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z'|| ch[i]<='A' && ch[i]>='Z') {
				remove=remove+ch[i];
				
			}
		}
		System.out.println(remove);
		
		System.out.println("======================================================");

		
	}
	public static void removeAllVowels(String g) {
		char[]a=g.toCharArray();
		String remove="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e'|| a[i]=='i'||a[i]=='o' ||a[i]=='u')
			{
				
			}
			else
			{
				remove=remove+a[i];
			}
			
		}
		System.out.println("remove all the spaces ");
		System.out.println(remove);
		System.out.println("===============================================================");
	}

}
