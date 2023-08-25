class PalindromeString {
	public static String palindrome(String str) {
		if( str == null || str.equals("")) return null;
		String subs ="";
		for(int i=0; i<str.length(); i++) {
			for(int j=str.length()-1; j>i; j--) {
				if(str.charAt(i) == str.charAt(j)) {
					while(i<=j) {
						subs += str.charAt(i);
						i++;
					} return subs;
				}
			}
		} return null;
	}

	public static void main(String[] args) {
		System.out.println(palindrome("babadb"));
	}
}