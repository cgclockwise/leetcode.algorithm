package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class isAnagram {
	public static boolean isAnagram(String s,String t){
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		if(Arrays.equals(s1, t1)){
			return true;}
		
		else{
			return false;}
		
	}
	
	public static void main(String[] args) {
		String ss1 = "ab";
		String ss2 = "b";
		System.out.println(isAnagram(ss1,ss2));
	}
}
