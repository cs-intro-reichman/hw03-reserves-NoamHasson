public class Calendar {

    /** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
		int and1Count = 0;
	    int debugDaysCounter = 0; 
        boolean s = true;
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year<n) {
			
			//if ( dayOfWeek == 1 ) 
			//System.out.println(dayOfMonth + "/" + month + "/" + year + " " + "sunday");	
			//else System.out.println(dayOfMonth + "/" + month + "/" + year);
			//if ( dayOfWeek ==1 && dayOfMonth ==1) and1Count++;
			advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
            while (s) {
			if ( year>n )
            break;
            if ( dayOfWeek == 1 ) 
			System.out.println(dayOfMonth + "/" + month + "/" + year + " " + "sunday");	
			else System.out.println(dayOfMonth + "/" + month + "/" + year);
			if ( dayOfWeek ==1 && dayOfMonth ==1) and1Count++;
			advance();
            }
	 	
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {

		dayOfMonth++;
		dayOfWeek++;
		if ( dayOfWeek>7) {
			dayOfWeek = 1;
		}
		if ( month==12 && dayOfMonth>nDaysInMonth(month, year)) {
			year++;
			month = 1;
			dayOfMonth = 1;
			
		}
		if ( dayOfMonth>(nDaysInMonth(month, year)) && month!=12) {
			month++;
			dayOfMonth = 1;
		} 
			
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    
		boolean checker = false;
	    if ( year % 400 == 0 ) {
			checker = true;
		} else if ( (year % 4) == 0 && (year % 100) != 0 ) {
			checker = true;
		} 
		
		return checker;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		
		switch ( month ) {
			case 1: month = 1;
			        return 31;
			case 2: month = 2;
					if ( isLeapYear(year) == true ) {
						return 29;
					} else {
						return 28;
					}			 
			case 3: month = 3;
					return 31;
			case 4: month = 4;
					return 30;
			case 5: month = 5;
					return 31;
			case 6: month = 6;
					return 30;
			case 7: month = 7;
					return 31;
			case 8: month = 8;
					return 31;
			case 9: month = 9;
		            return 30;
			case 10: month = 10;
					return 31;
			case 11: month = 11;
					return 30;
			case 12: month = 12;
					return 31;
				}
				return 0;
	  }
    }
    
  }


