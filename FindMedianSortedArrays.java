class FindMedianSortedArrays {
	public static double midFind(int [] num1, int num2[]) {
		int num[] = new int[num1.length+num2.length];
		for(int i=0; i<num1.length; i++) {
				num[i] = num1[i];
		}
		for(int j = 0; j<num2.length; j++) {
			num[(num1.length)+j] = num2[j];
		}

		for(int l=0; l<num.length; l++) {
			for(int k=0; k<num.length-1; k++) {
				if(num[k] > num[k+1]) {
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
				}
			}
		}

		for(int ele : num) {
			System.out.print(" "+ele);
		}
		
		double first = num[0];
		double last = num[num.length - 1];
		
		return (first + last) / 2;
	}

	public static void main(String[] args) {
		int num1[] = {0,0,0,0,0};
		int num2[] = {-1,0,0,0,0,0,1};
		System.out.println(" miden : "+midFind(num1, num2));
		int x = 15;
		int y = 2;
 		double c = x/y;
		System.out.println(c);
	}
}