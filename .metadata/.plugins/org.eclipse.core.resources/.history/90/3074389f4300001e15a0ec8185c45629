package dev.syntax.step01exception;

public class Finally {

	public static void main(String[] args) {
		method1();
		System.out.println("method1() 수행 종료, main()으로 복귀");
	}
	
	public static void method1() {
		try {
			System.out.println("method1 호출됨.");
			return;			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터 베이스에서 활용, DB 자원 반납하는 코드들 입력
			// 다른 버전의 자바에서는 finally 안쓰는 것도 있지만, 다른 코드들에서 보일 수 있기때문에 학습차원에서 사용함.
			System.out.println("method1()dml finally block 호출됨");
		}
	}
	
}
