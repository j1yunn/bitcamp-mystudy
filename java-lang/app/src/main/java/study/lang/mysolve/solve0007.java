package study.lang.mysolve;

// 키 큰 사람

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

    int[] array4 = {150, 150, 150, 150, 150};
    int height4 = 150;
    System.out.println(solution(array4, height4)); // 출력: 0
  }
}
