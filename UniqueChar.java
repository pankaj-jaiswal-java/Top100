import java.util.Scanner;

class UniqueChar {
	static boolean solve(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(j);
				if(ch1 == ' ' && ch2 == ' ') continue;
				if(ch1 == ch2) return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String : ");
		String str = sc.nextLine();
		System.out.println("All Unique char : "+solve(str));
	}
}