package maven;

import com.google.gson.Gson;

class Person {
	String mName;
	int mAge;
	
	public Person(String name, int age) {
		mName = name;
		mAge = age;
	}
}

public class App {

	private static Gson gson = new Gson();
	
	public static void main(String[] args) {
		Person person = new Person("Ali", 30);
		String personJson = gson.toJson(person);
		System.out.println(personJson);
	}
}
