import java.util.Scanner;

class ReverseNumber {
	public static int lengthOfNumber(int num) {
		if(num == 0) return 1;
		int length = 0;
		while(num !=0){
			num /= 10;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out. print("enter Number : ");
		int num = sc.nextInt();
		System.out.println("Length : "+lengthOfNumber(num));
	}
}