package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class p1 {
	public static void main(String args[]) {
		
		Integer [] a= {1,2,3,4,5,5,5};
				
		List<Integer> b =Arrays.asList(a);
		
		Set s = new LinkedHashSet(b);
		System.out.println(s);
				
	}
	
}