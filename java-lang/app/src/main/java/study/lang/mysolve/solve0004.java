package study.lang.mysolve;


// # 주석 - Javadoc 주석
//
// - "java document comment(doc comment)"
// - javadoc에서 HTML 문서를 만들 때 사용하는 주석이다.
// - 주로 API 문서를 자동 생성할 때 사용한다.
// - 클래스나 메서드, 변수 선언에 붙일 수 있다.
//

/**
 * 클래스에 대한 설명
 */
public class solve0004 {
  /**
   * 변수에 대한 설명 변수 선언 앞에 설명을 붙여 놓으면 나중에 HTML 문서를 만들 때 추출할 수 있다.
   */
  public static String message = "Hello, world!";

  /**
   * 메서드에 대한 설명 메서드에 대한 설명을 여기에 붙여 놓으면 나중에 HTML 문서를 만들 때 추출할 수 있다.
   *
   * @param args 애플리테이션 아규먼트 값을 보관한 배열
   */
  public static void main(String[] args) {
    System.out.println(message);
  }
}
