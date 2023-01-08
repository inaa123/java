package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1); //1이 integer1로 변해서 들어감.
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
	}
}
