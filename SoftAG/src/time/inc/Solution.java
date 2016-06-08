package time.inc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public static String method(String str)
	{
		if(str != null){
		char[] charr = str.toCharArray();
	
		Set<Character> se = new HashSet<>(charr.length);
		for(Character c : charr)
		{
			se.add(c);
		}
		System.out.println(Arrays.toString(se.toArray()));
		
		
		return se.toString();
		}else{
			return str;
		}
	}
	
public static void main(String[] srg) {
	
	System.out.println(Solution.method("aabc"));
}
}
