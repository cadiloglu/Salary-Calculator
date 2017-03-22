
public class Security extends Personnel {
	
	public float salary(int[] workingHours){
		
		int severancePay = (2016 - getYearOfStart()) * 16;
		int transMoney = 4*6*4;
		int foodMoney = 5*6*4;
		float validHours = 0;
		
		for(int i=0;i<4;i++){
			if( workingHours[i] >= 30 && workingHours[i] <= 54)
				validHours += workingHours[i];
			if(workingHours[i]>54)
				validHours += 54;
		}
		
		float totalSalary = validHours*13/2 + severancePay + transMoney + foodMoney;
		return totalSalary;
		
	}

}
