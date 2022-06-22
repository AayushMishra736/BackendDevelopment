package com.example.unittest;

public class Calculations {

	public static int findMax(int a[]) {
	int max = 0;	
	for(int i = 0;i < a.length;i++) {
		if(max < a[i]) {
			max = a[i];
		}
		
	}
		
	return max;
	}

	public static boolean isPalindrome(String s) {
	boolean isPalindrome = false;
	String reverse = "";
	char ch[];
	for(int i = 0;i < s.length();i++) {
		ch = s.toCharArray();
		reverse = reverse + ch;
	}	
	if(reverse.equals(s)) {
		isPalindrome = true;
	}
	else
	{
		isPalindrome = false;
	}

		return isPalindrome;
			
	}
	
	public static String AgeCheck(int n) {
	String s = null;	
	if(n > 3 && n < 18)	{
		s = "Under Age";
		return s;
	}
	else
		if(n > 18)
		{
			s = "Ready To Vote";
			return s;
		}
		else
			return s;
	}
	
	public static void endLessloop(int i){
		while(i < 1000000000) {
			i++;	
		}
	}
}
