package study.oop.clazz;

// 연습: 클래스 문법을 메서드 분류하는 용도로 사용
//
public class Test01 {
  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?
    // 3 * 4 / 2 + 6 = ?

    // 메서드가 사용할 result 변수 생성
    Calculator c1 = new Calculator(); // 첫번째 계산식의 결과를 저장할 변수 생성

    c1.plus(2); // 2 (계산식1)
    c1.plus(3); // 2 + 3 (계산식1)
    c1.minus(1); // 2 + 3 - 1 (계산식1)
    c1.multiple(7); // 2 + 3 - 1 * 7 (계산식1)
    c1.divide(3); // 2 + 3 - 1 * 7 / 3 (계산식1)

    System.out.printf("result1 = %d\n", c1.getResult());

    // 새 계산식: 8 * 2 - 3 = 13
    c1.clear();
    c1.plus(8);
    c1.multiple(2);
    c1.minus(3);
    System.out.printf("result2 = %d\n", c1.getClass());
  }
}
