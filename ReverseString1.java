// using Recursion 

import java.util.Scanner;

class ReverseString1 {
	static void reverse(String str, String newstr, int index) {
		if(index < 0) {System.out.println("updated String : "+newstr); return;}
		char ch = str.charAt(index);
		newstr += ch;
		reverse(str, newstr, index-1);
	}

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverse(str, "", str.length()-1);
	}
}