package java_study.co.kr.jooungbu;

import java.util.ArrayList;
import java.util.List;

public class L15StreamAPIEx {
	static int sum2;
	public static void main(String[] args) {
		
		Interger n = new Integer(500);
		System.out.println(10+n);
		System.out.println(10+n.intValue());
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(500);
		numList.add(55);
		numList.add(5);
		numList.add(null);
		numList.add(555);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		int sum = 0;
		for(int num : numList) { // int num=numList.get(i).intValue(); => int num=null.intValue();
			if(num!=null) {
				sum += num;
			}
		}
		// 1. null 을 int로 형변환할 때 오류가 발생
		// 2. sum+null에서 오류
		// 3. null의 필드가 없는데 참조해서 오류
		System.out.println(sum);
		
		numList stream()
			.filter(i->i!=null)  // 검사식에서 true를 반환하는 값만 steam으로 다시 반환
			.forEach((i)->{sum2+=i;}); // forEach(최종연산)
		
		System.out.println(sum2);
		// 파일 입출력(문자열 입출력, 바이너리코드 입출력)
	}

}
