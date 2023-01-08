package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>(); 넘 길어서 아래로쓸수있음
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); //벨류. 우리는 이 각각의 벨류를 키로 구분할 것
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.println(i + " ");
		System.out.println();
		
		//특정 벨류 하나만,  인덱스 즉 키를 입력 
		System.out.println(list.get(0)); //0번째키 를 불러오기
		
		//이터레이팅  list.size()가 리턴하는 것은 원소의 개수
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		/*
		 //get은 데이터를 읽는것, 꺼내서  없앨려면 remove이용하기
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		*/
	
		//과제] remove() list의 모든 원소를 삭제하라.
		/*
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);	
		*/
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list); // 텅 비어있게
		
		
		
	}
}
