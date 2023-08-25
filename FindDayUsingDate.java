class FindDayUsingDate {
	public static void  finddate(int day, int month, int  year) {
		int mcode[] = {1,4,4,0,2,5,0,3,6,1,4,6};
		int centurycode[] = {6,4,2,0};
		// for month code
		int mc = mcode[month-1];
		int y = year/100;
		int cc = centurycode[y%4];
		int reminderyear = year % 100;
		int leafy = reminderyear / 4;

		if(year%4 == 0) {
			if(month == 1 || month == 2) 
				mc--;
		}
		
		System.out.println("date : "+day+
			 "\nmonth code : "+mc+
			"\ncentury code : "+cc+
			"\nreminder Year : "+reminderyear+
			"\nleaf year : "+leafy);

		int d = (day+mc+cc+reminderyear+leafy)%7;
		
		switch (d) {
			case 0: 
				System.out.println("Saturday");
			break;

			case 1: 
				System.out.println(" Sunday");
			break;

			case 2: 
				System.out.println("Monday");
			break;

			case 3: 
				System.out.println("Tuesday");
			break;

			case 4: 
				System.out.println("Wednesday");
			break;

			case 5: 
				System.out.println("Thursday");
			break;

			case 6:
				System.out.println("Friday");
			break;

			default:
				System.out.println("Some thing Wrong");
		}
	}


	public static void main(String[] args) {
		finddate(25,12,2059);
	}
}