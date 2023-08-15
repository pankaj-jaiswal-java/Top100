import java.util.Scanner;

class ReverseString {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the String : ");
		String str = sc.nextLine();
		System.out.println("your updated String : "+reverse(str));
	}

	public static String reverse(String str) {
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			str1 = str1+ch;
		}
		return str1;
	}
} 