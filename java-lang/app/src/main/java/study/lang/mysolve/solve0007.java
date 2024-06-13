package study.lang.mysolve;

// 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가 매개변수로 주어질 때,
// 길동이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성하기

public class solve0007 {
  public static int solution(int[] array, int height) {
    int count = 0;
    for (int h : array) {
      if (h > height) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] array1 = {150, 160, 170, 180, 190};
    int height1 = 165;
    System.out.println(solution(array1, height1)); // 출력: 3

    int[] array2 = {150, 160, 170, 180, 190};
    int height2 = 195;
    System.out.println(solution(array2, height2)); // 출력: 0

    int[] array3 = {150, 160, 170, 180, 190};
    int height3 = 150;
    System.out.println(solution(array3, height3)); // 출력: 4

    int[] array4 = {150, 150, 150, 150, 150};
    int height4 = 150;
    System.out.println(solution(array4, height4)); // 출력: 0
  }
}
