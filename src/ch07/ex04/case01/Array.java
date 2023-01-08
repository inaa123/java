package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3]; //String타입 데이터를 3개 담을 수있는 배ㅕㅇㄹ객체.
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", strs[0], strs[1], strs[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		for(int i = 0; i < ints.length; i++ ) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		
		System.out.println("\n");
		
		//for each라고 부른다. 
		for(int i: ints) System.out.print(i + " ");
			//왼쪽 원소를 담을 변수, 오른쪽은 collection  , 변수에 관심x변수에 담긴 데이터에 관심d
		
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
 	} 
}
//integer 를 wapper class라고 부름 : int값을 class로 포장했다.