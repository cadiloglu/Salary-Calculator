import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read {

	public void getPersonnelInfo(String path, Manager manager, Worker worker, Security security, Officer officer,
			Chief chief, PartTime part) { // Reads an input file (Personnel.txt) and gets information of each component.
											
		try {
			int i = 0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line;
			}

			String[] linesPart1 = new String[4];

			for (int j = 0; j < 6; j++) {
				linesPart1 = results[j].split("	");

				if (linesPart1[2].equals("MANAGER")) {
					manager.setName(linesPart1[0]);
					manager.setRegisterNumber(linesPart1[1]);
					manager.setPosition(linesPart1[2]);
					manager.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

				if (linesPart1[2].equals("WORKER")) {
					worker.setName(linesPart1[0]);
					worker.setRegisterNumber(linesPart1[1]);
					worker.setPosition(linesPart1[2]);
					worker.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

				if (linesPart1[2].equals("SECURITY")) {
					security.setName(linesPart1[0]);
					security.setRegisterNumber(linesPart1[1]);
					security.setPosition(linesPart1[2]);
					security.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

				if (linesPart1[2].equals("OFFICER")) {
					officer.setName(linesPart1[0]);
					officer.setRegisterNumber(linesPart1[1]);
					officer.setPosition(linesPart1[2]);
					officer.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

				if (linesPart1[2].equals("CHIEF")) {
					chief.setName(linesPart1[0]);
					chief.setRegisterNumber(linesPart1[1]);
					chief.setPosition(linesPart1[2]);
					chief.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

				if (linesPart1[2].equals("PARTTIME_EMPLOYEE")) {
					part.setName(linesPart1[0]);
					part.setRegisterNumber(linesPart1[1]);
					part.setPosition(linesPart1[2]);
					part.setYearOfStart(Integer.parseInt(linesPart1[3]));
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int[] getWorkingHours(String path, String registerNumber) { // This method gets weekly working hours and returns as and integer array.

		int[] weeklyHours = new int[4];

		try {
			int i = 0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line;
			}
			String[] linesPart2 = new String[5];
			for (int j = 0; j < 6; j++) {
				linesPart2 = results[j].split("	");
				for (int k = 0; k < 6; k++) {
					if (linesPart2[0].equals(registerNumber)) {
						weeklyHours[0] = Integer.parseInt(linesPart2[1]);
						weeklyHours[1] = Integer.parseInt(linesPart2[2]);
						weeklyHours[2] = Integer.parseInt(linesPart2[3]);
						weeklyHours[3] = Integer.parseInt(linesPart2[4]);
					}
					;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return weeklyHours;
	}

}
