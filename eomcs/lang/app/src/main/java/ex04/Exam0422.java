package ex04;

//# 부동소수점 변수 - 변수의 메모리 크기 II
//
public class Exam0422 {
  public static void main(String[] args) {

    // 8바이트 부동소수점 변수
    //- 유효자릿수 15자리 부동소수점 저장 가능
    //- 10 진수로 부동소수점을 표현할 경우 소수점을 제외한 숫자가 15 개인 경우 정상적으로 메모리에 저장된다는 의미
    //
    double d;

    d = 9.99999999988888; // 소수점을 떼면 숫자의 개수가 15개이다.
    System.out.println(d);

    d = 9999999.88888888; // 소수점을 떼면 숫자의 개수가 15개이다.
    System.out.println(d);

    d = 99999999998888.8; // 소수점을 떼면 숫자의 개수가 15개이다.
    System.out.println(d);

    // 소수점을 뗐을 때 앞에 0만 있을 경우 그 0은 자릿수에서 제외한다.
    d = 0.00000999999999988888; // 소수점을 떼면 숫자가 21개 이지만, 앞의 0을 제외하면 실제 7개이다.
    System.out.println(d); // OK

    // 주의!
    //- 유효자릿수가 15자리를 넘어가면 정상적으로 값을 저장되지 않을 수 있다.
    //- 리터럴 값이 이미 유효자릿수를 넘어간다.
    //- 변수에 저장하기 전에 리터럴 값이 이미 반올림 되거나 잘린다.
    d = 9.999999999999997;
    System.out.println(d);

    // 변수에 값을 넣기 전에 리터럴에서 맨 뒤의 값이 반올림 되거나 잘린다.
    d = 999999999999999.7; 
    System.out.println(d);
    
    // 주의!
    //'유효자릿수'는 부동소수점의 저장 가능 여부를 간단히 계산하기 위해 나온 개념이다.
    //실제는 유효자릿수에 해당하는 부동소수점이라도 정규화 과정을 통해 2 진수로 변환되는 과정에서 
    //값이 짤리는 경우가 있음을 잊지 말라!
    //
    //
    // 단정도(single precision)와 배정도(double precision)
    //- double 변수는 float 변수에 두 배 정도 더 정밀한 값을 저장할 수 있다.
    //  그래서 '배정도(double precision)'라 한다.
    //- float은 double과 비교하여 한 배 정도 정밀한 값을 저장할 수 있다.
    //  그래서 '단정도(single precision)'이라 한다.
    //
  }
}
