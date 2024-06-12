package study.lang.mysolve;

// 정수 num1과 num2가 매개변수로 주어질 때, 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성하기

public class solve0004 {
  public int solution(int num1, int num2) {
    if (num1 == num2) {
      return 1;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    solve0004 sol = new solve0004();

    // 예제 테스트
    int num1 = 6;
    int num2 = 3;

    int result = sol.solution(num1, num2);
    System.out.println("두 수가 같으면 1, 다르면 -1: " + result); // 출력: -1
  }
}

