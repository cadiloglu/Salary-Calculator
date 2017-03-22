public class Main {

	public static void main(String[] args) {
		
		Writer write = new Writer();
		Read read = new Read();
		Manager manager = new Manager();
		Worker worker = new Worker();
		Security security = new Security();
		Officer officer = new Officer();
		Chief chief = new Chief();
		PartTime part = new PartTime();

		read.getPersonnelInfo(args[0], manager, worker, security, officer, chief, part);
		
		write.output(manager, read.getWorkingHours(args[1], manager.getRegisterNumber()));
		write.output(worker, read.getWorkingHours(args[1], worker.getRegisterNumber()));
		write.output(security, read.getWorkingHours(args[1], security.getRegisterNumber()));
		write.output(officer, read.getWorkingHours(args[1], officer.getRegisterNumber()));
		write.output(chief, read.getWorkingHours(args[1], chief.getRegisterNumber()));
		write.output(part, read.getWorkingHours(args[1], part.getRegisterNumber()));

	}

}
