package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		//animal은 인터페이스 => new Animal 못함, 
		//Animal 배열객체 만들기 
		Animal[] animals = new Animal[3]; //, 애니멀 타입 객체를 만든게 안리ㅏ 애니멀 타입에 들어갈 객체를 만든것
		
		animals[0] = new Cat("헤롱이"); //cat이 animal로 프로모션돼서 할당됨
		animals[1] = new Dog("왈왈이"); //dog이 animal로 프로모션돼서 할당됨
		animals[2] = new Dog("상큼이");
		
		for(Animal animal: animals)
			System.out.println(animal); //고양이나 개를 꺼내X  동물을 꺼내!
		
		Object[] objs = new Object[3]; //고양이,개 등 다 객체로..
		objs[0] = new Cat("해롱이"); //cat이 object로 프로모션돼 할당
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("상큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
		//거짓된 데이터가 들어 올 수 있기 때문에, object이 가능은하지만 사용하지않는다. 
		//그러나 다양한 타입 받고 싶을 땐 general사용하기
	}
}
