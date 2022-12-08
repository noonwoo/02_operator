package edu.kh.op.practice;

public class OperatorPractice {
	
	public void practice4(){
		
		
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		// 아니라면 불합격을 출력하세요.
		
		
		int kor = 60;
		int eng = 80;
		int math = 40;
		int avg = 60;
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println();
		
		System.out.println(result ? "합격" : "불합격");
	}
	
	

}
