package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		//runnable타입의 값2개 만들기 (스레드 만든 거 X)
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		//THREAD만드는 또다른 방법
		Executor executor = Executors.newCachedThreadPool(); //thread가 모이는 pool
		executor.execute(r1);
		executor.execute(r2);//스레드두개 만들어짐
	}
}
