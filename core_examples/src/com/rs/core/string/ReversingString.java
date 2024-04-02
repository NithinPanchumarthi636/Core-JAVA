package com.rs.core.string;

public class ReversingString {
	
	 public static void main(String[] args) {
	        String str="Nithin ";
	        String result="";
	        
	    for(int i=str.length()-1;i>=0;i--)
	    result+=str.charAt(i);
	    
	   System.out.println(result);
	    }
	}


