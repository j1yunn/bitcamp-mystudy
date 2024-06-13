package study.lang.mysolve;

// 분수의 덧셈

public class solve0009 {
  public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
    // 공통 분모를 구함
    int commonDenom = denom1 * denom2;
    // 각 분수를 공통 분모를 사용하여 통분
    int commonNumer = numer1 * denom2 + numer2 * denom1;

    // 최대공약수를 구하여 기약 분수로 변환
    int gcd = gcd(commonNumer, commonDenom);
    int reducedNumer = commonNumer / gcd;
    int reducedDenom = commonDenom / gcd;

    return new int[] {reducedNumer, reducedDenom};
  }

  // 최대공약수를 구하는 유클리드 호제법
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    // 테스트 예시
    int[] result1 = solution(1, 2, 1, 3);
    System.out.println(result1[0] + "/" + result1[1]); // 출력: 5/6

    int[] result2 = solution(2, 3, 3, 4);
    System.out.println(result2[0] + "/" + result2[1]); // 출력: 17/12
  }
}
