package study.lang.mysolve;

// 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성하기

public class solve0003 {
  public int solution(int num1, int num2) {
    return num1 / num2;
  }

  public static void main(String[] args) {
    solve0003 sol = new solve0003();

    // 예제 테스트
    int num1 = 6;
    int num2 = 3;

    // solution 메서드 호출 및 결과 출력
    int result = sol.solution(num1, num2);
    System.out.println("두 정수의 몫: " + result);
  }
}

