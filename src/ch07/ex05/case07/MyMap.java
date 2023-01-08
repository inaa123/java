package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();//제너릭타입 인티저 유저 선언.
	
		map.put(1, new User("최한석")); //첫번째 파라미터는 키, 두번째는 벨류
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map); //키와 벨류잘자옴
		
		//한석이만 읽고싶을ㄸ
		User user = map.get(1); //1번키 
		System.out.println(user);
		System.out.println(map); //맵안에 한석이 잘있음
		
		//맵안에서 한석이 꺼내기
		user = map.remove(1); //1번키 => 한석이 빼기
		System.out.println(map);
	}
}
