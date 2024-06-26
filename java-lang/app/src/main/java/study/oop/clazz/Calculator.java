package study.oop.clazz;

public class Calculator {

  private int result = 0; // 접근 제어 문법 사용

  void plus(int a) {
    this.result += a;
  }

  void minus(int a) {
    this.result -= a;
  }

  void multiple(int a) {
    this.result *= a;
  }

  void divide(int a) {
    this.result /= a;
  }

  int getResult() { // getter 사용
    return this.result;
  }

  void clear() {
    this.result = 0;
  }
}


