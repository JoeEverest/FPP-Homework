package lesson8.prob1;

import java.util.Arrays;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room else call resize()
	public void add(Person s) {
		if(s == null) return;
		if(size+1 >= PersonArray.length){
			resize();
		}

		PersonArray[size] = s;
		size++;
	}

	// 2. get person information by passing index
	public Person get(int i) {
		if(i > PersonArray.length || i > size) return null;
		return PersonArray[i];
	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {
		if(lastName == null || lastName.isEmpty()) return false;

		for (Person p: PersonArray){
			if(p!=null && p.getLast().equals(lastName)){
				return true;
			}
		}
		return false;
	}
 
  	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		if(lastName == null || lastName.isEmpty()) return false;

		int findIndex = -1;
		for (int i = 0; i< size; i++){
			if(PersonArray[i].getLast().equals(lastName)){
				findIndex = i;
				break;
			}
		}

		if(findIndex == -1) return false;

		for (int i = findIndex+1; i <= size; i++) {
			PersonArray[i-1] = PersonArray[i];
		}

		PersonArray[size] = null;
		size--;

		return true;
	}
  	// 5. Resizing the list
	private void resize() {
		PersonArray = Arrays.copyOf(PersonArray, PersonArray.length*2);
	}
   // To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[\"");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i]).append("\", \"");
		}
		sb.append(PersonArray[size - 1]).append("\"]");
		return sb.toString();
	}
   // Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Bruce", "Tom", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));

		System.out.println("\nSize() : " + list.size() + "\n" + list);

		list.remove("Tom");

		System.out.println("\nSize() : " + list.size() + "\n" + list);
		System.out.println("\nSearching of Lermon: " + list.find("Lermon"));

		System.out.println(list.get(2));
	}
}