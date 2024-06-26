package ex03;

//# 정수 리터럴 - 메모리 크기에 따른 표기법
//- 정수를 저장할 메모리의 크기를 지정할 수 있다.
//- 메모리의 크기에 따라 표현할 수 있는 정수의 크기가 다르다.
//
public class Exam0230 {
  public static void main(String[] args) {
    //## 4바이트 정수
    //접미사를 붙이지 않고 그냥 숫자를 표현하면 4바이트 크기의 메모리에 저장되는 정수를 표현한다.
    System.out.println(2147483647); // 4바이트 양의 정수 최대값
    System.out.println(-2147483648); // 4바이트 음의 정수 최소값

    //4바이트 메모리 크기를 초과하면 컴파일 오류가 발생한다.
    //System.out.println(2147483648);
    //System.out.println(-2147483649);

    //## 8바이트 정수
    //4바이트 메모리를 벗어나는 정수 값을 표현할 때 사용한다.
    //숫자 뒤에 L 또는 l을 붙인다.
    //보통 대문자를 붙인다. 왜? 소문자 l은 숫자 1과 헷갈리기 때문이다.
    System.out.println(2147483648L);
    System.out.println(-2147483649L);

    //## 4바이트 또는 8바이트 정수의 최대값과 최소값
    //자바에서는 각 데이터 유형에 따라 최대/최소 값을 알아볼 수 있도록 특별한 명령을 제공한다.
    System.out.println(Integer.MAX_VALUE); // 4바이트로 표현할 수 있는 정수 최대값
    System.out.println(Integer.MIN_VALUE); // 4바이트로 표현할 수 있는 정수 최소값
    System.out.println(Long.MAX_VALUE); // 8바이트로 표현할 수 있는 정수 최대값
    System.out.println(Long.MIN_VALUE); // 8바이트로 표현할 수 있는 정수 최소값

    //## 주의!
    //- 다음은 크기가 다른 정수이다.
    System.out.println(100); // 4바이트 크기의 정수 값
    System.out.println(100L); // 8바이트 크기의 정수 값
  }
}

/*
# 메모리 크기와 정수의 범위
1 비트: 2**1
  - 음수가 없는 경우: 0, 1
2 비트: 2**2
  - 음수가 없는 경우: 00(0), 01(1), 10(2), 11(3) (0 ~ 3)
  - 음수가 있는 경우: 00(0), 01(1), 10(-2), 11(-1) (-2 ~ 1)
4 비트: 2**4
  - 음수가 없는 경우: 0 ~ 2**4 - 1 = 0 ~ 15
  - 음수가 있는 경우: -2**3 ~ 2**3 - 1 = -8 ~ 7
8 비트: 2**8
  - 음수가 없는 경우: 2**8 = 0 ~ 2**8-1 = 0 ~ 255
  - 음수가 있는 경우: -2**7 ~ 2**7-1 = -128 ~ 127
16비트: 2**16
  - 음수가 없는 경우: 0 ~ 2**16-1 = 0 ~ 65535
  - 음수가 있는 경우: -2**15 ~ 2**15-1 = -32768 ~ 32767
32비티: 2^32
  - 음수가 없는 경우: 0 ~ 2**32 - 1 = 4,294,967,296
  - 음수가 있는 경우: -2**31 ~2**31 - 1 = -2,147,483,648 ~ 2,147,483,647
64비트: 2^64 =
  - 음수가 있는 경우: 약 -900경 ~ 900경

## 정리
- 4바이트 정수 리터럴
  예) 100

- 8바이트 정수 리터럴
  정수 뒤에 접미사 L 또는 l을 붙인다.
  예) 100L (주로 사용)
  예) 100l
 */