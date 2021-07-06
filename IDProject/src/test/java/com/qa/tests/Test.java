package com.qa.tests;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="teste",rev=" ";

for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
	
}
System.out.println(rev.trim());

}
}
