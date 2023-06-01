package dev.syntax.step02logging;

import java.util.logging.Level;
import java.util.logging.Logger;

// Logger 라이브러리로 출력가능한 레벨 설정할 수 있음.

public class Step02ConfigLevel {
	// 로거 객체 생성
	private static final Logger logger = Logger.getLogger(Step02ConfigLevel.class.getName());
	
	public static void main(String[] args) {
		// 부모 로거 생성
		Logger rootLogger = Logger.getLogger("");
		rootLogger.setLevel(Level.FINE); //전역 설정 변경
		rootLogger.getHandlers()[0].setLevel(Level.FINE); // logger 설정 변경 전역 설정 변경과 동일하게
		logger.setLevel(Level.FINE);
		
		logger.log(Level.INFO, "INFO 레벨 출력");
		logger.log(Level.WARNING, "WARNING 레벨 출력");
		logger.log(Level.CONFIG, "CONFIG 레벨 출력");
		logger.log(Level.FINE, "FINE 레벨 출력");
		logger.log(Level.FINER, "FINER 레벨 출력");
		
	}

}
