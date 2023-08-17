import java.util.Scanner;

class StringSearch {
	public static void search(String str, String s) {
		if(s == null) {
			System.out.println("String is Empty");
		 	return;
		}
		String str1 ="";
		for(int i=0; i<str.length(); i++) {
				str1 += str.charAt(i);
				if(str1.length() == s.length()){
					if(str1.equals(s)) {
						System.out.println("found : "+str1);
						return;
					} else {
						String str2 = "";
						for(int k=1; k<s.length(); k++) {
							str2 += str1.charAt(k);
						} str1 = str2;
					}
				} 
		}  System.out.println("not Fount : "+s);
	}

	public static void main(String []args) {
		search("my name is pankaj", null);
	}
}

			