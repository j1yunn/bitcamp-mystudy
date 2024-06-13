package study.lang.mysolve;

// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성하기

public class solve0006 {
  public static int solution(int[] array, int n) {
    int count = 0;
    for (int num : array) {
      if (num == n) {
        count++;
      }
    }
    return count;
  }


  // 예제 테스트
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 3, 2, 3};
    int n1 = 3;
    System.out.println(solution(array1, n1)); // 출력: 3

    int[] array3 = {1, 1, 1, 1, 1};
    int n3 = 1;
    System.out.println(solution(array3, n3)); // 출력: 5

    int[] array4 = {1, 2, 3, 4, 5};
    int n4 = 6;
    System.out.println(solution(array4, n4)); // 출력: 0
  }
}

