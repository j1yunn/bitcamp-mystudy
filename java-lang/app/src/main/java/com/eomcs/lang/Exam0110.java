package com.eomcs.lang;


public class Exam0110 {
  public static void main(String[] args) {
    // << 비트 이동 연산자 사용법
    // - 왼쪽으로 비트를 이동시킨다.
    // - 오른 쪽 빈자리는 0으로 채운다.
    // - 왼쪽 경계를 넘어간 비트는 자른다.
    //
    int i = 1;

    System.out.println(i << 1);

    System.out.println(i << 2);

    System.out.println(i << 3);

    System.out.println(i << 4);


    i = 11; // [00000000000000000000000000001011]
    System.out.println(i << 1); // 0[00000000000000000000000000010110] => 22
    System.out.println(i << 2); // 00[00000000000000000000000000101100] => 44
    System.out.println(i << 3); // 000[00000000000000000000000001011000] => 88

    // 왼쪽 이동
    // - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다.
    // - 값을 배수로 증가시킬 때 곱하기 연산을 하는 것 보다
    // 왼쪽 비트 이동 연산을 하는 것이 빠르기 때문에
    // 실무에서는 이 비트 이동 연산을 자주 사용한다.
    // - 비트 이동 => '2**이동비트'를 곱한 것과 같은 결과를 만든다.
  }
}
