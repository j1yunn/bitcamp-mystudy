package study.lang.mysolve;

// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return 하도록 solution 함수를 완성하기

public class solve0001 {
  public int solution(int num1, int num2) {
    return num1 + num2; // 두 정수의 합을 반환
  }

  public static void main(String[] args) {
    solve0001 sol = new solve0001();

    // 예제 테스트
    int num1 = 3;
    int num2 = 5;

    // solution 메서드 호출 및 결과 출력
    int result = sol.solution(num1, num2);
    System.out.println("두 정수의 합: " + result);
  }
}
