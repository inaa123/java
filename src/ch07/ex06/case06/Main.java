package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet(); //A타입 원소담는 캐비닛
		Cabinet<B> cabinet2 = new Cabinet();
		//Cabinet<C> cabinet3 = new Cabinet(); //cabinet타입 A이하만 가능
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
	
		cabinet1.getLastVal(arr1);
		cabinet1.getLastVal(arr2); //B가 A롶 프로모션됨
		cabinet2.getLastVal(arr2);
		//cabinet2.getLastVal(arr1);
		
		//cabinet1.getFinalVal(arr1); C이하가 아님
		//cabinet1.getFinalVal(arr2);
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}
