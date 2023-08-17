import java.util.Scanner;

class LenghtOfString {
	static void solve(String str) {
		int i=0;
		try{ 
			while(true) {
				char ch = str.charAt(i);
				i++;
			}
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String length : "+i);
		}
	}

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a String : ");
		String str = sc.next();
		solve(str);
		System.out.println("pankaj");
	}
}