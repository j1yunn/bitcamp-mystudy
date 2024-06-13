package study.lang.mysolve;

// 두 수의 곱

public class solve0008 {
  public int solution(int num1, int num2) {
    return num1 * num2; // 두 정수의 곱을 반환
  }

  public static void main(String[] args) {
    solve0008 sol = new solve0008();

    // 예제 테스트
    int num1 = 1486;
    int num2 = 8;

    // solution 메서드 호출 및 결과 출력
    int result = sol.solution(num1, num2);
    System.out.println("두 정수의 곱: " + result);

  }
}
