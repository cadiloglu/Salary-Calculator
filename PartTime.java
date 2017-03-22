
public class PartTime extends Employee {
	public float salary(int[] workingHours){
		int validWorkHours=0;
		for (int i = 0; i < 4; i++){
			if(workingHours[i ]>= 10 && workingHours[i] <= 20)
				validWorkHours += workingHours[i];
			if(workingHours[i] > 20)
				validWorkHours += 20;
		}
		
		float totalSalary = validWorkHours*12;
		return totalSalary;
	}
}
