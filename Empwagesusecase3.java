package fundamentals;

public class Empwagesusecase3 {
	
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	
	
	public static void main(String[] args) {
		//variables
		 
		int EMP_WAGES_PER_HOUR = 20;
		int empHrs = 0;
		int empWages = 0;
		
		int empcheck = (int)Math.round(Math.random());
		switch (empcheck)
		{
		 case IS_PART_TIME:
			 		empHrs = 4;
			 		break;
		 case IS_FULL_TIME:
			 		empHrs = 8;
			 		break;
		 default:
			 	empHrs = 0;
			 	break;
		}
		empWages = empHrs * EMP_WAGES_PER_HOUR;
		System.out.println("emp wages:" + empWages);
		}
		
	}
