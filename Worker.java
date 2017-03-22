
public class Worker extends FullTime {

	public float salary(int[] workingHours){
		
		int dayOfWork = 5*4;
		int severancePay = (2016-getYearOfStart())*16;
		int overWorkHours = 0;
		
		
		for(int i=0;i<4;i++){
			if( (workingHours[i]-40) > 10)
				overWorkHours += 10;
			else
				overWorkHours += (workingHours[i]-40);

		}
		
		int overWorkSalary = overWorkHours * 4;
		
		float totalSalary = dayOfWork*73 + severancePay + overWorkSalary;
		return totalSalary;
	}
}
