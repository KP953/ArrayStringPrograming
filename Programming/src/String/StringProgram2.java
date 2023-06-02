package String;

public class StringProgram2 {

	public static void main(String[] args) {
		String s = "Meet me at the clock Tower";
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int x=i%3;
			switch(x) {
			case 0: 
				s1[i]=vowel(s1[i]);
				break;
			case 1:
				s1[i]=consonant(s1[i]);
				break;
			case 2:
				s1[i]=uppercase(s1[i]);
				break;
			}
			System.out.print(s1[i]+" ");

		}
		
	}	

	
	public static String vowel(String s) {
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'|| a[i]=='e'||a[i]=='o'||a[i]=='i'||a[i]=='u')
			{
				a[i]='%';
			}
		}
		return new String(a);
		
	}
	public static String consonant(String s) {
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='a' && a[i]!='e' &&a[i]!='o' &&a[i]!='i' &&a[i]!='u' )
			{
				a[i]='#';
			}
		}
		return new String(a);
		
	}
	public static String uppercase(String s)
	{
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		return new String(a);
	}

}
