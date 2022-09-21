package java_study.co.kr.jooungbu;

enum E { // 열거형(type) E
	
}

interface C { // type C
	void print(); //추상 메서드만 정의할 수 있다.
}

abstract class B { //type B
	public abstract void print(); // 추상 메소드를 정의할 수 있다.
	
}

class A { // A type
	
}

public class L03Type {
	class InClass extends B{

		@Override
		public void print() {
			
		}
	}
	public static void main(String[] args) {
		
		
		A a = new A();
//		B b = new B();
//		C c = new C();
		// 인터페이스와 추상클래스는 추상메서드가 있기 떄문에 객체로 생성할 수 없다.
		B b = new B() { // 생성과 동시에 추상메소드를 구현하면 객체로 생성할 수 있다.
			@Override
			public void print() {
				
			};
		};
		C c = new C() {
			@Override
			public void print() {
				
			}
		};
		B b2 = new L03Type().new InClass();
		// 람다식 : 함수형언어 (함수가 객체)를 표방항 화살표함수로 작성된 객체(자바에서는 함수가 객체가 될 수 없다.)
		// 자바에서 람다식을 작성하기 위해서는 인터페이스에 추상메서드가 1개 있을 경우 가능하다.
		// 자바에서 함수를 매개변수로 사용할 수 없기 때문에 함수를 매개변수로 사용하려면 꼭 타입을 정의해야한다. 이것을 간편하기 위해서 람다식을 사용
		
		// 자바에서 함수를 객체로 사용 (x) 문법적 설탕 ( 함수형 언어인 척)
		
		C c2 = () -> {}; // 인터페이에에 추상메소드가 1개 있을 경우 람다식으로 갹체를 생성할 수있다.9함수량
	}
}
