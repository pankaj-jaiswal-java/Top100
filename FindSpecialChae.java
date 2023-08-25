import java.util.Scanner;

class FindSpecialChae {
	public static void findSpecial(String str) {
		if(str == null) {
			System.out.println("String is null");
			return;
		}

		char ch[] = new char[str.length()];
		String str1 = "";
		System.out.println(ch.length);
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		} for(int j=0; j<str.length(); j++) {
			for(int k=j; k<ch.length; k++){
				if(ch[j] != ch[k]){
					str1 += ch[j];
				}
			}
		}

		System.out.println(str1+" : "+ str1.length());
	}

	public static void main(String[] args) {
		findSpecial("abcabcc");
	}
}
					