package tut11.ex1;

public class Person {
	protected String name;
	

	protected int age;
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	protected void setAge(int age)  throws IllegalArgumentException {
		if(age < 1) {
			throw new IllegalArgumentException("Age of person can not be negative!");
		}
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
		return sb.toString();
	}
}
