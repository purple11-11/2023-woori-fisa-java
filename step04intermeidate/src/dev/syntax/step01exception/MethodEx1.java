package dev.syntax.step01exception;


public class MethodEx1 {

	public static void main(String[] args) throws Exception {
        method1();	 // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
    }	// main메서드의 끝

    static void method1() throws Exception{
        method2();
    }	// method1의 끝

    static void method2() throws Exception { // throws - 호출한 쪽(현재 method2() 입장에서는 method1())으로 예외를 떠넘김
        throw new Exception(); //의도한 동작으로 코드를 짰는데, 예외를 직접 만들어야 할 때 사용하는 키워드(throw - 일부러 예외를 만들어서 던짐)
    }	// method2의 끝
}