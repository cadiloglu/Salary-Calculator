
public class Manager extends Personnel {

	
	public float salary(int[] workingHours) {

		int baseSalary = 1800;
		int ssBenefits = baseSalary * 135 / 100;
		int severancePay = (2016 - getYearOfStart()) * 16;
		int overWorkHours = 0;
		for(int i=0;i<4;i++){
			if( (workingHours[i]-40) > 8)
				overWorkHours+=8;
			else
				overWorkHours+=workingHours[i]-40;
		}
		
		int overWorkSalary = overWorkHours * 5;

		float totalSalary = baseSalary + ssBenefits + severancePay + overWorkSalary;
		return totalSalary;
	}
}