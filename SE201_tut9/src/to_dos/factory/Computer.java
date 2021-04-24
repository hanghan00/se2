package to_dos.factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
		duration = 4;
		System.out.println("Duration(months): " +duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public void getFeePerSemester() {
		fee =230;
		System.out.println("Fee per month: $"+fee);
	}
} 
