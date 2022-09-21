package java_study.co.kr.jooungbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class GenericTest<T> {
	T name; // 기본값은 Object
	public void GenericTest(T name) {
		this.name = name;
	}
}
interface Carable{}
class Qm3 implements Carable{
	@Override
	public String toString() {return "르노삼성의 qm3";}
}
class Qm5 implements Carable{}
// Carable이 부모인 타입만 제네릭으로 지정 가능
class CarInfo<T extends Carable>{
	T car;
	public void print() {
		System.out.println(car.getClass() + " : " + car.toString());
	}
}


public class L07Generic {
	public static void main(String[] args) {
		Qm3 qm3 = new Qm3();
		Qm5 qm5 = new Qm5();
		CarInfo carInfo = new CarInfo();
		carInfo.car = qm3;
		carInfo.print();
		
		
		
		
		GenericTest a = new GenericTest("경민");
		System.out.println(a.name);
		GenericTest<Integer> a2 = new GenericTest<Integer>(200);
		System.out.println(a2.name);
		GenericTest<Integer> a3 = new GenericTest<Integer>(null);
		System.out.println(a3.name);
		
		
		List<Integer> list = new ArrayList<Integer>(); // 기본형은 제네릭으로 사용할 수 없다.
//		list.add("1");
		// Integer는 int의 랩퍼 클래스
		// 기본형의 랩퍼 클래스가 하는 일 (Byte, Short, Integer, Long, Float, Double, Character)
		// 1. 형변환 Integer.T("13");
		// 2. 기본 데이터 타입의 정보를 포함 Integer.MAX_VALUE
		// 3. 제네릭 타입으로 사용된다.
		
		list.add(1);
		list.add(20);
		list.add(300);
		System.out.println(list);
		
		Object [] birthArr = {1986, "2000", 1990.0, 2002F, 1900l}; // 태어난 날만
		int now = 2022;
		Object[] ageArr = new Object[5];
		for (int i=0; i<birthArr.length; i++) {
			try {
				
				int age = (now-(int)birthArr[i]);
			} catch (Exception e) {}
			char[] age;
			System.out.println(age);
			
			ageArr[i] = age;
		}
		List birthList = newArrayList();
		birthList.add(1986);
		birthList.add("1986");
		birthList.add(1986.0);
		birthList.add(1986f);
		birthList.add(1986l);
		for (int i=0; i<birthList.size(); i++) {
			int age = now - (int)birthList.get(i); // 컴파일시 발견되지 않는 심각한 오류
		}
		List<Integer> birthList2 = new ArrayList<Integer>();
		birthList2.add(1986);
//		birthList2.add("1986");
//		birthList2.add(1986.0);
//		birthList2.add(1986f);
//		birthList2.add(1986l);
		// 제네릭을 사용하면 정수만 필드로 참조할 수 있다.
		// List와 Array의 Key : index (순서가 있는)
		// Map에서 key : 중복되지 않는 어떤 것이든 가능(Set)
		Map<Integer, String> person = new HashMap<Integer, String>();
		person.put(1986, "최경민");
		person.put(1986, "홍길동");
		person.put(2000, "고길동");
		person.put(2002, "둘리");
		System.out.println(person); // {2000=고길동, 1986=홍길동, 2022=둘리}
		// key는 중복될 수 없는 Set 타입이기 떄문에 "최경민"을 "홍길동" 재정의 함
		// Map의 자료구조는 순서가 없다.
		System.out.println(person.get(2002));
		
		Set<Integer> set = HashSet<Integer>(); // 중복이 허용되지 않는 순서가 없는 자료 구조
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(11);
		set.add(14);
		set.add(20);
		System.out.println(set);
	}

}
