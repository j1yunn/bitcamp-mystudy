package study.lang.mysolve;

// 숫자 비교하기

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

