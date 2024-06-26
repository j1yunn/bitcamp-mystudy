package ex04;

//# 부동소수점 변수 - 변수와 리터럴의 크기
//
public class Exam0423 {
  public static void main(String[] args) {

    float f;
    double d;

    // 변수도 크기에 따라 구분되지만, 리터럴도 크기에 따라 구분된다.
    // - 부동소수점 리터럴 값 뒤에 f나 F를 붙이면, 4바이트 크기의 부동소수점 값을 의미한다.
    // - 부동소수점 리터럴 값 뒤에 d나 D를 붙이거나 아무것도 붙이지 않으면, 8바이트 크기의 부동소수점 값을 의미한다.

    f = 9999.888f; // 4바이트 변수 = 4바이트 리터럴
    System.out.println(f);


    d = 99999999.8888888; // 8바이트 변수 = 8바이트 리터럴
    System.out.println(d);
    
    // - float 메모리에 값을 저장할 때는 유효자릿수가 7자리 이하인 4바이트 부동소수점(f 또는 F가 붙은)을 저장하라!
    // - double 메모리에 값을 저장할 때는 유효자릿수가 15자리 이하인 8바이트 부동소수점을 저장하라!
  }
}
