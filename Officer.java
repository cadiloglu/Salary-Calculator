
public class Officer extends Personnel {

	public float salary(int[] workingHours){
		int baseSalary = 1800;
		int ssBenefits = baseSalary * 49 / 100;
		int severancePay = (2016 - getYearOfStart()) * 16;
		int overWorkHours = 0;
		for(int i=0;i<4;i++){
			if( (workingHours[i]-40) > 10)
				overWorkHours+=10;
			else
				overWorkHours+=workingHours[i]-40;
		}
		
		int overWorkSalary = overWorkHours * 4;
		float totalSalary = baseSalary + ssBenefits + severancePay + overWorkSalary;
		return totalSalary;
	}
}
