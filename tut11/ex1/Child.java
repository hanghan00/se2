package tut11.ex1;

public class Child extends Person {
	public Child(String name, int age) {
		super(name, age);
		this.setName(name);
		this.setAge(age);
	}
	
	protected void setAge(int age) throws IllegalArgumentException {
		if(age > 15) {
			throw new IllegalArgumentException("Age of Child must be less than 15!");
		}
		
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
		return sb.toString();	}

}
