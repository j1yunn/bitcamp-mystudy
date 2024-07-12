package study.oop.nested;

public class Test01 {
  interface Printer {
    void print();
  }

  public static void main(String[] args) {

    new Printer() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    }.print();


  }

}
