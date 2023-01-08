package ch08.ex02.case04;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job { //HR과제01에서 우리가 사용한 것.
	EXIT, LIST, ADD, FIX, DEL; //ordinal값 자동 부여됨 0~4번까지
	
	public static Job toJob(int ordinal) { //숫자를 job으로 리턴시키는..
		return values()[ordinal]; //value코드들의 배열을 얻게됨, ordinal을 인덱스로 사용.
	}
	
	public static Job toJob2(int ordinal) {
		/*
		Stream<Job> stream = Arrays.stream(values()); //values()배열을 stream으로 변환..?
		stream = stream.filter(job -> job.ordinal() == ordinal);
		Optional<Job> job = stream.findFirst(); //원소가 몇개가 있던 첫번째 꺼 꺼내줌.
		return job.orElse(null); // 뽑아낸 코드를 리턴하거나 없으면 null리턴
		 */
		
		//chaining
		return Arrays.stream(values())
				.filter(job -> job.ordinal() == ordinal)
				.findFirst()
				.orElse(null);
	}
}
