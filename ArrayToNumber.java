class ArrayToNumber {
	public static void m1(int num1[]) {
		int no1 = 0, n1 = 1;
		int no2 = 0, n2 = 2;
		for(int i=0; i<num1.length; i++) {
			no1 += num1[i]*n1;
			n1 *=10;
		}

		System.out.println("number = "+no1);
	}

	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		m1(num1);
	}
}