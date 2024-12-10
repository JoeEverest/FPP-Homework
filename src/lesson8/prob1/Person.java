package lesson8.prob1;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String firstName, String lastName, int a) {
		// constructor
		this.lastName = lastName;
		this.firstName = firstName;
		age = a;
	}

	// --------------------------------------------------------------
	public String getLast() {
	// get last name
			return lastName;
	}

	@Override
	public String toString() {
		return lastName + " " + firstName + " " + age;
	}
	// end class Person
}
