package study.lang.mysolve;

// 두 수의 차

public class solve0002 {
  public int solution(int num1, int num2) {
    return num1 - num2;
  }

  public static void main(String[] args) {
    solve0002 sol = new solve0002();

    // 예제 테스트
    int num1 = 6;
    int num2 = 2;

    // solution 메서드 호출 및 결과 출력
    int result = sol.solution(num1, num2);
    System.out.println("두 정수의 차: " + result);
  }
}
