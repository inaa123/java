package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex04"); //현재 사용하는 패키지명
	}
	
	public void log() {
		logger.info("로깅을 시작합니다.");
		
		try {
			throw new Exception("일부러 예외를 만들었습니다.");
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("로깅을 끝냅니다.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}
//앱이 종료되면 로그가 사라짐 ->단점 ->그래서 파일로 출력해야함!