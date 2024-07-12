package study.oop.nested;

public class Test01 {
  interface Printer {
    void print();
  }

  public static void main(String[] args) {

    class PrinterImpl implements Printer {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    }

    Printer obj = new PrinterImpl();
    obj.print();


  }

}
