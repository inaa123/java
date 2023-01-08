package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());	
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅을 끝냅니다.");
		//메모리에 저장
		
		handler.flush();//객체에 있던(메모리) 메시지를 쏟아냄
		handler.close();
	}
	
	public static void main(String[] args) throws Exception {
		new C03FileLogger().log();
	}
}
//원래 로거의 기본 핸들러ㅏ는 콘솔, 근데 우리가 새로 만든 핸들러를 쓸거야. 로거는 두개 사용가능해지ㅏㅁ