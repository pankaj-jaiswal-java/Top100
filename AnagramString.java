import java.util.Scanner;

class AnagramString {
	public static boolean solve(String str1, String str2) {
		if(str1.length() == str2.length()) {
			int count = 0;
			for(int i=0; i<str1.length(); i++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);
				if(ch1 == ch2) {
					count++;					
				} else return false;
			}  if(count == str1.length()) return true; else return false;
		} else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first String : ");
		String str1 = sc.nextLine();
		System.out.print("enter second String : ");
		String str2 = sc.nextLine();
		System.out.println(solve(str1,str2));
	}
}
	