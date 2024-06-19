package study.oop.clazz;

public class Test04 {

  // nested class
  class B {} // non-static nested class
  static class c {} // static nested class
  Object obj1 = new Object () {}; // anonymous class
  
  void m1() {
    class D {} // local class
    
    Object obj2 = new Object () {}; // // anonymous class
  }
  
}

// package member class
class A {}