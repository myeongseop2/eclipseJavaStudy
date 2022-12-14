package java_study.co.kr.jooungbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class L19StreamAPIEx5 {
	
	class Student{
			
			private String name;
			private boolean isMale;
			private int hak;
			private int ban;
			private int score;
			
			public Student(String name,boolean isMale,int hak,int ban,int score) {
				this.name=name;
				this.isMale=isMale;
				this.hak=hak;
				this.ban=ban;
				this.score=score;
			}
			// get set을 필드를 정의하는 객체를 VariableObject(VO) DataTransferObject(DTO) 라 한다
			
			// 디자인 패턴과 ModelViewController => Spring
			
			// 캡슐화에 대해 아는 만큼 설명하라, vo dto가 무엇인가요?, 디자인 패턴
			public String getName() {return name;}
			public boolean isMale() {return isMale;}
			public int getHak() {return hak;}
			public int getBan() {return ban;}
			public int getScore() {return score;}
			
			public boolean setScore(int score) {
				if(score<=100 && score > 0) {
					this.score = score;
					return true;
				}else {
					return false;
				}
			}
			
			@Override
			public String toString() {
				return "{"+name +","+isMale+","+hak+","+ban+","+ score+"}";
			}
		}
	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>();
		L19StreamAPIEx5 out=new L19StreamAPIEx5();
		studentList.add(out.new Student("나자바", true, 1, 1, 300));
		studentList.add(out.new Student("김지미", false, 1, 1, 250));
		studentList.add(out.new Student("김자바", true, 1, 1, 200));
		studentList.add(out.new Student("이지미", false, 1, 2, 150));
		studentList.add(out.new Student("남자바", true, 1, 2, 100));
		studentList.add(out.new Student("안지미", false, 1, 2, 50));
		studentList.add(out.new Student("황지미", false, 1, 3, 100));
		studentList.add(out.new Student("강지미", false, 1, 3, 150));
		
		studentList.add(out.new Student("나자바", true, 2, 1, 300));
		studentList.add(out.new Student("김지미", false, 2, 1, 250));
		studentList.add(out.new Student("김자바", true, 2, 1, 200));
		studentList.add(out.new Student("이지미", false, 2, 2, 150));
		studentList.add(out.new Student("남자바", true, 2, 2, 100));
		studentList.add(out.new Student("안지미", false, 2, 2, 50));
		studentList.add(out.new Student("황지미", false, 2, 3, 100));
		studentList.add(out.new Student("강지미", false, 2, 3, 150));

		studentList.add(out.new Student("나자바", true, 3, 1, 300));
		studentList.add(out.new Student("김지미", false, 3, 1, 250));
		studentList.add(out.new Student("김자바", true, 3, 1, 200));
		studentList.add(out.new Student("이지미", false, 3, 2, 150));
		studentList.add(out.new Student("남자바", true, 3, 2, 100));
		studentList.add(out.new Student("안지미", false, 3, 2, 50));
		studentList.add(out.new Student("황지미", false, 3, 3, 100));
		studentList.add(out.new Student("강지미", false, 3, 3, 150));
		
		// lazy 연산 (연산 지연) : Stream api는 연산 지연을 한다.
		// 반복문 == 일 (시간, 돈) Stream의 중간연산과 최종연산이 모두 반복문이라면 사용한 만큼 시간이 걸리지만 연산지연의 의해서 효율적으로 반복문을 반복한다.
		// Stream 이 외부 반복문보다 속도가 빠르다는 설명이 있지만 실제로는 더 연산이 오래 걸린다.
		
		//1학년 남자들의 점수
		Optional <String> boySum = studentList.stream()
				.filter(Student::isMale)
				.filter(p->p.hak==1)
				.map(p->p.score+"") // 11 => "11"
				.reduce((s1,s2)->s1+","+s2);
//				.forEach(System.out::println);
		
		String scores="";
		
		for(Student s : studentList) {
			if(s.getHak()==1 && s.isMale) {
				scores+=s.getScore();
			}
		}
		//2학년 여자들의 점수
		//1한년의 남자 여자의 수를 collect로 구현하세요!
		//1한년을 남자 여자의 그룹으로 나누고 다시 통과(score>=150)와 낙제 그룹으로 나누세요.
		//1학년 남자,여자 그룹의 평균 점수를 구하세요
		//각학년 별 남자 여자 그룹의 점수가 가장 높은 사람을 구하세요 // 집계함수 사용
		// 2학년을 남자 여자 그룹으로 나누고 다시 통과한 사람과 낙제한 사람의 수를 구하세요
		//모든 학년을 그룹으로 나누고 학년마다 남자와 여자 그룹의 수를 구하세요
		// 모든 학년을 그룹을 나누고 학년마다 반 그룹으로 나누세요
	}
}
