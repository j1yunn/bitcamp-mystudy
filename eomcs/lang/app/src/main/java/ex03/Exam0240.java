package ex03;

//# 정수 리터럴 - 메모리에 저장하는 방법
//- 컴퓨터에서는 값을 저장할 때 전기 신호(예: RAM) 또는 자기 신호(예: HDD)로 저장한다.
//- 값은 비트로 표현되고, 각 비트는 전기가 있거나 없는 두 상태로 표현한다.
//- 비트의 두 가지 상태를 표현할 때 2진수의 1과 0을 사용한다.
//- 따라서 값을 메모리에 저장하려면 2진수로 표현할 수 있어야 한다.
//
//* 참고!
//- 그림이나 사진(BITMAP), 음성(WAV), 색상(RGB)을 저장할 때도 2진수로 표현한다.
// 

public class Exam0240 {
  public static void main(String[] args) {
    System.out.println(5 - 3);
    System.out.println(5 + (-3));
  }
}

//## 정수를 2진수로 표현하는 방법
//1) 부호-크기/절대값(Sign-Magnitude)
//- 부동 소수점에서 가수부(significand or mantissa)를 저장할 때 사용한다.
//- 맨 왼쪽 1비트를 부호 비트로 사용한다. 양수는 0, 음수는 1 이다. 
//- 나머지 비트는 절대값(magnitude)으로 저장한다.
//    8비트 = 1비트(부호) + 7비트(절대값)
//  예) +24 => |+24| = 24 ---> 0001 1000
//  예) -24 => |-24| = 24 ---> 1001 1000
//- 수의 범위(8비트 기준): -127 ~ + 127
//   0111 1111 (127)
//   0111 1110 (126)
//   0111 1101 (125)
//      ...
//   0000 0001 (1)
//   0000 0000 (+0)
//   1000 0000 (-0)
//   1000 0001 (-1)
//      ...
//   1111 1101 (-125)
//   1111 1110 (-126)
//   1111 1111 (-127)
//- 단점
//  - 두 개의 0(+0, -0)이 존재한다.
//  - 양수와 음수를 더했을 때 옳지 않은 값이 나온다.
//     예) 4비트일 경우, 1 + -1 = ?
//         0001(+1) + 1001(-1) = 1010 (-2) <-- 계산 결과가 옳지 않다.
//  - 빼기를 처리하는 컴퓨팅 회로를 별도로 설계해야 하므로 하드웨어가 복잡해진다.
//- 장점
//  - 이해하기 쉽다!
//
//2) 1의 보수(Ones' Complement)
//- 모든 비트를 반대 값으로 바꾼다.
//  예) +24 => 0001 1000
//  예) -24 => 1110 0111
//- 수의 범위(8비트 기준): -127 ~ +127
//   0111 1111 (127)
//   0111 1110 (126)
//   0111 1101 (125)
//      ...
//   0000 0001 (1)
//   0000 0000 (+0)
//   1111 1111 (-0)
//   1111 1110 (-1)
//      ...
//   1000 0010 (-125)
//   1000 0001 (-126)
//   1000 0000 (-127)
//- 단점
//  - 두 개의 0(+0, -0)이 존재한다.
//  - 두 수를 더한 후 비트 크기를 초과한 1 값을 다시 맨 뒤에 더해야만 옳은 값이 된다.
//    예) 4비트일 경우,
//       0001(+1)
//       1110(-1)
//       --------
//       1111(-0) <--- 음수 0과 양수 0을 다뤄야 하는 것이 번거롭다.
//
//       0101(+5)
//       1100(-3)
//       --------
//     1 0001(1) <--- 옳지 않은 값.
//     +    1    <--- 4비트를 초과하는 값을 다시 맨 뒤에 더함.
//     ---------
//       0010(2) <--- 옳은 값!
//
//3) 2의 보수(Two's complement)
//- 자바에서 음수를 저장하는 방법이다.
//- 1의 보수의 문제점을 해결하기 위해 등장한 방법.
//- 음수 0을 없앰으로써 -128까지 표현할 수 있음.
//- 2의 보수를 만드는 방법 1:
//  - 모든 비트를 반대 값으로 만든 다음 1을 더한다.
//  예) 0010 1001(+41)
//      1101 0110(1의 보수)
//              1
//      ---------
//      1101 0111(-41)
//- 2의 보수를 만드는 방법 2:
//  - 오른쪽에서부터 1을 찾는다.
//  - 찾은 1의 왼쪽편에 있는 모든 비트를 반대 값으로 바꾼다.
//    예) 0010 1001(41) => 1101 0111(-41)
//                ^                ^
//    예) 0010 1100(44) => 1101 0100(-44)
//              ^                ^
//- 2의 보수를 만드는 방법 3:
//  - 2^n(8비트일 경우 2^8 = 256)에서 음수 값 만큼 뺀다.
//    예) -41 => 256 - 41 = 215 = 1101 0111
//    예) -44 => 256 - 44 = 212 = 1101 0100
//- 수의 범위(8비트 기준): -128 ~ +127
//   0111 1111 (127)
//   0111 1110 (126)
//   0111 1101 (125)
//      ...
//   0000 0010 (2)
//   0000 0001 (1)
//   0000 0000 (+0)
//   1111 1111 (-1)
//   1111 1110 (-2)
//      ...
//   1000 0011 (-125)
//   1000 0010 (-126)
//   1000 0001 (-127)
//   1000 0000 (-128)
//- 장점
//  - 양수와 음수의 덧셈이 가능하다.
//  - 음수 0이 없다. 0에 대한 표현이 한 가지이다.
//
//4) K-초과(Excess-K)
//- 부동 소수점의 지수부(exponent)를 저장할 때 사용한다.
//- 오프셋 바이너리(offset binary) 또는 바이어스된 표기법(biased representation) 이라고도 한다.
//- K를 바이어스 값이라 부르며, 표현하려는 값에 더할 때 사용한다.
//    표현하려는 값 + 초과 값(K) = 결과
//- 바이어스 값(K)을 구하는 공식:
//    K = 2^(비트수 - 1)
//  예) 8비트일 경우 ---> K = 2^(8 - 1) = 2^7 = 128, 결과 = 128 + 값
//   1111 1111 = 128 + 127
//   1111 1110 = 128 + 126
//   1111 1101 = 128 + 125
//      ...
//   1000 0001 = 128 + 1
//   1000 0000 = 128 + 0
//   0111 1111 = 128 + (-1)
//      ...
//   0000 0010 = 128 + (-126)
//   0000 0001 = 128 + (-127)
//   0000 0000 = 128 + (-128)
//
//- IEEE 부동소수점 표준에서는 다음의 공식을 사용한다.
//    K = 2^(비트수 - 1) - 1
//  예) 8비트일 경우 ---> K = 2^7 - 1 = 127, 결과 = 127 + 값
//   1111 1111 = 127 + 128
//   1111 1110 = 127 + 127
//   1111 1101 = 127 + 126
//   1111 1100 = 127 + 125
//      ...
//   1000 0000 = 127 + 1
//   0111 1111 = 127 + 0
//   0111 1110 = 127 + (-1)
//      ...
//   0000 0010 = 127 + (-125)
//   0000 0001 = 127 + (-126)
//   0000 0000 = 127 + (-127)
//
//- 바이어스 방식으로 데이터를 저장할 때의 이점?
//  - 모든 비트가 0일 때 최소 값을 가지고, 모든 비트가 1일 때 최대 값을 갖는다.
//  - 이런 이유로 작은 값에서 큰 값으로 정렬되는 결과를 낳는다.
//  - 모든 비트가 정렬된 상태이기 때문에 부동소수점이든 정수이든 상관없이 값을 비교할 때 속도가 빠르다.
//  - '부호-크기', '1의 보수', '2의 보수'와 같은 방법으로 값을 표현할 경우, 비트들이 순차적으로 정렬되지 않는다.
//
//## 2의 보수를 사용하여 8비트 정수를 저장하기
//  예) 10(10진수)  => 0000 1010(2진수)
//  예) -10(10진수) => 1111 0110(2진수)
//
//## -10을 2진수로 표현하기
//1) 10을 2진수로 바꾼다.
//   +10 => 0000 1010
//2) 1의 보수로 바꾼다. 즉 0은 1로 1은 0으로 바꾼다.
//   0000 1010 => 1111 0101
//3) 2의 보수로 바꾼다. 1의 보수에 1을 더한다.
//     1111 0101
//   + 0000 0001
//     ---------
//     1111 0110
//
//## 음수가 2의 보수로 저장되었을 때 이점
//- 덧셈으로 빼기를 수행할 수 있기 때문이다.
//  예) 10 - 7 = 10 + (-7) = 3
//      10      => 0000 1010
//      7       => 0000 0111
//      -7      => 1111 1000 + 1 = 1111 1001
//
//      0000 1010 (10)
//    + 1111 1001 (-7)
//    -----------------
//    1 0000 0011 (3)  => 8비트를 넘어가는 값은 버린다.
//

