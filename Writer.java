import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Writer {
	
	public void output(Personnel personnel, int[] workingHours){ // This method creates output ".txt" files.
		try{
			File output = new File(personnel.getRegisterNumber() + ".txt");
			FileWriter fWriter = new FileWriter(output,false);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			String split[] = personnel.getName().split(" ");
			bWriter.write("Name : " + split[0]);
			bWriter.newLine();
			bWriter.write("Surname : " + split[1]);
			bWriter.newLine();
			bWriter.write("Registration Number : " + personnel.getRegisterNumber());
			bWriter.newLine();
			bWriter.write("Position : " + personnel.getPosition());
			bWriter.newLine();
			bWriter.write("Year Of Start : " + personnel.getYearOfStart());
			bWriter.newLine();
			bWriter.write("Total Salary : " + String.format( Locale.ENGLISH , "%.2f TL", personnel.salary(workingHours)) );
			bWriter.newLine();
			bWriter.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
