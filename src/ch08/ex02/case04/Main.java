package ch08.ex02.case04;

public class Main {
	public static void main(String[] args) {
		int choice = 1;
		String jobName = "";
		
		switch(Job.toJob(choice)) {//유저가입력한 숫자가 job타입으로 리턴
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName= "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제";
		}
		
		choice = 7;
		Job job = null;
		switch((job = Job.toJob2(choice)) != null ? job : Job.EXIT) {
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName= "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제";
		}
		
		
		System.out.println(jobName); //숫자를 job으로 변환
	}
}
