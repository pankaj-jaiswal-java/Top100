class SearchSubString {
	public static void search(String str, String subs) {
		if(subs == null) {
			System.out.println("Please pass a String its null : "+subs);
			return;
		}

		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			str1 += ch;
			if(ch == ' ') {
				str1 = "";
			}

			if(subs.equals(str1)) {
				System.out.println("String Founded : "+subs);
				return;
			}
		} System.out.println("String not Found");
	}

	public static void main(String[] args) {
		search("my name is pankaj", "pankaj");
	}
}