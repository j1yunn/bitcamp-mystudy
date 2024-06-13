package study.lang.mysolve;

// 두 수의 나눗셈

public class solve0005 {
  public int solution(int num1, int num2) {
    return num1 % num2;
  }

  public static void main(String[] args) {
    solve0005 sol = new solve0005();

    // 예제 테스트
    int num1 = 7;
    int num2 = 5;

    int result = sol.solution(num1, num2);
    System.out.println("수의 나머지: " + result); // 출력: -1

  }
}
