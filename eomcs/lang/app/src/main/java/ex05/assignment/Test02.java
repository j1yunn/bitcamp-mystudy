package ex05.assignment;

import java.util.Scanner;

//# 과제2 : 다섯 개의 정수 값을 입력 받고 최소, 최대 값을 구하라.
//실행 예)
//입력? 4 17 -1 6 9
//최소값: -1
//최대값: 17
//
public class Test02 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
    System.out.print("입력? ");
    while (true) {
      int no = keyScan.nextInt();
      if (no == 0) // 입력값으로 0을 사용할 수 없는 문제가 있다.
        break;
      min = no < min ? no : min;
      max = no > max ? no : max;
    }
    
    System.out.printf("최소값: %d\n", min);
    System.out.printf("최대값: %d\n", max);
    
    keyScan.close();
  }

}
