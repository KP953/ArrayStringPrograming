package String;

public class StringProgram3 {

	public static void main(String[] args) {
		String s = "calculate";
		duplicateInString(s);
		firstuniqecharinString(s);
		maxRepeatingChar(s);
		lexo();
		
	}

	public static void duplicateInString(String s) {
		char[] c = s.toCharArray();
		boolean[] b = new boolean[c.length];
		System.out.println("Program1:>>>> Duplicates in given String");
		for (int i = 0; i < c.length; i++) {
			if (b[i] ==false) {
				int count = 1;
				for (int j = i+1; j < c.length; j++) {
					if (c[i] == c[j]) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(c[i]+" :"+count);
			}
		}
		System.out.println("===========================================");


	}
	public static void firstuniqecharinString(String s) {
		char[]c=s.toCharArray();
		boolean[]b=new boolean[c.length];
		System.out.println("Program2:>>>>>>>> First uniqe char in given string");
		for(int i=0;i<c.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count==1) {
					
					System.out.println(c[i]+":"+count);
					break;
				}
			}
		}
		System.out.println("==================================================");
	}
	public static void maxRepeatingChar(String s) {
		char[]c=s.toCharArray();
		boolean[]b=new boolean[c.length];
		System.out.println("Program3:>>>> max repeating char in given String");

		for(int i=0;i<c.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>1) {
					System.out.println(c[i]+":"+count);
				}
			}
		}
		System.out.println("======================================================");
	}
	public static void lexo() {
		String[] s1= {"Javed sir","Bikash sir","Nagesh sir","Animesh sir"};
		String temp;
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].compareTo(s1[j])>0) {
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
			
		}
		System.out.println("lexographical order");
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
			}
		
	
}
