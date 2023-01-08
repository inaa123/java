package ch06.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("야코미", 3);
		
		cat = new Cat(null, 0); //과제 println했을시 null과 0이 나오게하는 법
		
		//getName은 상속받은것 cat클래스에X음.
		System.out.println(cat.getName() + ", " + cat.getAge()); 
	}
}
