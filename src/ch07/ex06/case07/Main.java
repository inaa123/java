package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		//printList<> 파라미터의 프린트리스트의 뭐시기를 준비
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		list1.add(1); list1.add(2); //list1에 들어간 1과 2의 타입은? number타입
		list2.add(1); list2.add(2); //list2에들어간 원소타입 ? Integer타입
		list3.add(1.0); list3.add(2.0);
		list4.add("a"); list4.add("b");
		
		pocket.printList(list1);
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		System.out.printf("%.1f\n%.1f\n%.1f", 
				pocket.add(list1),
				pocket.add(list2),
				pocket.add(list3));
			//pocket.add(list4) String은 ㅇㅇㅇ가 아님
		pocket.add2(list1);
		pocket.add2(list2);
		//pocket.add2(list3);
		//pocket.add2(list4);
	}
}
