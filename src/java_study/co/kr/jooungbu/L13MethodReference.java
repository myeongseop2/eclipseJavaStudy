package java_study.co.kr.jooungbu;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class L13MethodReference {

	public static void main(String[] args) {

		// 메소드 참조(람다식을 한번 더 줄여서 작성)
		// "13"->13
		Function<String, Integer> parseInt=(s){return Integer.parseInt(s);};
		Function<String, Integer> parseInt2=s->Integer.parseInt(s);
		Function<String, Integer> parseInt3=Integer::parseInt;
		//컴파일러가 해석할 수 있는 정도의 생략만 가능
		//매개변수가 무조건 존재하고 반환할 때 실행되는 함수가 매개변수를 꼭 1개 사용하기 때문에
		System.out.println(parseInt3.apply("99")*3);
		
		//문자열 두 객체를 equals로 같은지 검사하는 함수 작성
		BiPredicate<String, String> strEquals=(s1, s2)->s1.equals(s2);
		BiPredicate<String, String> strEquals2=String::equals; // 메서드 참조는 매개변수를 생략
		
		String str = "안녀앟세요";
		String str = new String("안녕하세요!!");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		System.out.println(strEquals.test(str, str2));
		System.out.println(strEquals2.test(str, str2));
		
		char[] charArr = {'안', '녕', '하','가','세','요'};
		String msg = new Stirng(charArr);
		System.out.println(msg);
		
		Function<char[], String> parseStr = cArr->new String(cArr);
		
		System.out.println(parseStr.apply(new char[]{})));
	}

}
