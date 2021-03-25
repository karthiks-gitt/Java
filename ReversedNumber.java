package com.demo;

public class ReversedNumber {

	public static void main(String[] args) {
		String str = Integer.toBinaryString(47);
		int binaryReverse = getBinaryReversedNumber(str);
		System.out.println(binaryReverse);
	}
	
	private static int getBinaryReversedNumber(String str) {
		int length = str.length();
		
		// number of 0's to be added
		int a = (int)(8 - length % 8.0);
		
		for(int i=0; i<a; i++) {
			str = '0' + str;
		}
		
		// reverse the binary string
		String rev="";  
	    for(int i=str.length()-1;i>=0;i--){  
	        rev = rev + str.charAt(i);  
	    }

	    int res = Integer.parseInt(rev, 2);
		return res;
	}
	
}
