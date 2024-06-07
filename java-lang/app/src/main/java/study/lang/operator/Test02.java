package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.
//
// 학습 내용
// - byte, short, char를 산술연산할 때 int로 변환한 후 수행한다.
// - 같은 타입끼리만 연산할 수 있다.
// - int와 int의 연산 결과는 int이다.
// - 다른 타입으로 변환하는 것을 '형변환(type casting)' 이라 한다.
//
//

public class Test02 {
  public static void main(String[] args) {
    byte b1 = 100;
    byte b2 = 20;
    byte b3;

    // 다음 테스트를 해 보고, 컴파일 나는 이유를 설명하고
    // 컴파일 오휴가 나지 않도록 해결하라.

    b3 = 100 + 20; // 리터럴끼리의 연산 결과는 리터럴이다.
    b3 = (byte) (b1 + b2); // byte, char, short는 int로 변환된 후 실행된다.
    System.out.println(b3);

    int r = b1 + b2; // OK

    char c = 20;
    short s = 30;
    // short r2 = c + s;


    // int i1 = 21_0000_0000;
    // int i2 = 21_0000_0000;
    // int i3 = i1 + i2;
    // System.out.println(i3); // -94967296, 오버플로우


    long i1 = 22_0000_0000l;
    long i2 = 21_0000_0000;
    long i3 = i1 + i2;
    System.out.println(i3); // 유효범위를 벗어나므로 l 붙이기
  }
}
