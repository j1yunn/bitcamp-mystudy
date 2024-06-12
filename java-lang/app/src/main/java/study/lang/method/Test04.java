package study.lang.method;

public class Test04 {
  public static void main(String[] args) {

  }

  static String m1(String name, int age) {
    String message = name + "(" + age + ")님 반가워요!";
    String.format("%s(%d)님 반가워요", name, age);
    return message;
  }

}
