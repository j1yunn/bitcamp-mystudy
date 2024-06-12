package study.lang.mysolve;

// 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성하기

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
