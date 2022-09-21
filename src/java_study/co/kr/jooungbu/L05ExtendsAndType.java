package java_study.co.kr.jooungbu;

class ObjectA{
	String a = "ObjectA.a 입니다.";
}
class ObjectB extends ObjectA{
	String b = "ObjectB.b 입니다.";
}
class ObjectC extends ObjectB{
	String c = "ObjectC.c 입니다.";
}

// 상속받은 타입을 자식이라 하고 상속을 한 타입을 부모라 한다.
// 자식은 부모의 필드를 물려 받는다.

public class L05ExtendsAndType {
	public static void main(String[] args) {
		// 상속은 타입의 다형성을 만든다.
		ObjectC c = new ObjectC();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		ObjectB b = c;
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);
		
		ObjectA a = c;
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
		
		
		Object o = c;
//		System.out.println(o.a);
//		System.out.println(o.b);
//		System.out.println(o.c);		

		// c가 참조하는 객체가 줄어드는 것일까요?? : 객체는 그대로고 부모의 타입만큼만 참조
		
		Object o_c = (ObjectC)o; // 캐스팅 형변환
		
		try {
			String s_o = (String)o; // 객체와 상관없는 타입으로 캐스팅 형변환하면 오류(심각한 오류)가 발생 => 실행도중에 오류 발생하면 어플이 멈춘다. => 예외처리
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

//		int i = (int) "문자열"; // 오류가 있어서 컴파일 할 수 없다. => 미리 오류를 발견해서 앱으로 배포되지 않음 (js의 단점)
		// 컴파일 되는 언어의 장점 : 오류가 있는 코드를 배포하지 않는다.
		System.out.println("오류가 발생되면 실행되지 않을 코드");
	}

}
