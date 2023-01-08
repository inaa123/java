package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryResource {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try(
			PrintWriter out1 = new PrintWriter(new FileWriter("c:/DEV/1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/2.txt"));
		) {
			for(int i = 0; i < arr.length; i++) {
				out1.println("arr[" + i + "]: " + arr[i]);
				out2.println("arr[" + i + "]: " + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외가 발생했습니다.");
		} catch(IOException e) {
			System.out.println("IO 예외 발생했습니다.");
		} 
		
		System.out.println("끝");
	}
}