package com.java8.streams;

public class HowManyWordsCanFormFromGivenString {

    private static void jumbleWords(String s,String ans) {
    
    if(s.length() == 0) {
    System.out.println(ans + " ");	
    	return;
    }
    
	for(int i =0; i < s.length();i++) {
		char ch = s.charAt(i);
		String ros = s.substring(0,i) + s.substring(i + 1);
		jumbleWords(ros,ans + ch);
	}
		
	}
	public static void main(String[] args) {
	String s = "raHUL";
    jumbleWords(s,"");
	/* System.out.println("Words Form Are : " + jumbleWords(s)); */
	
	}

}
