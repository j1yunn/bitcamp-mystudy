package study.oop.clazz;

import study.oop.clazz.vo.Score;

// 데이터 타입 정의
// 1) 클래스 사용전:
// - 낱개 변수 사용
// 2) 성적 데이터를 저장할 메모리를 새로 정의: Score 클래스
// - '사용자 정의 데이터 타입(user-defined data type)'이라 부른다.
// - 여러 개로 이루어진 데이터를 한 묶음으로 다루면 관리하기가 쉽다.
// 3) 리팩토링: printScore() 메서드
// - 메서드 추출(extract method): 중복되는 코드가 있으면 별도의 메서드로 분리한다.
// 4) 리팩토링: compute() 메서드
// - 메서드 추출(extract method): 한 개의 메서드는 한 개의 기능을 수행해야 한다.
// 5) GRASP(General Responsibility Assignment Software Patterns) 패턴: compute() 메서드 이동
// - Information Expert: 데이터를 다룰 때는 그 데이터를 갖고 있는 객체에게 묻는다.
// - 리팩토링: 메서드 이동(Move Method)
// - 메서드를 관련된 클래스로 이동시킨다. => 코드를 이해가 쉽다.
// 6) 인스턴스 메서드: compute() 메서드를 non-static 메서드로 전환
// - 인스턴스 주소를 더 쉽게 받는 문법
// 7) 클래스를 역할에 따라 패키지로 분류: vo 패키지 생성 및 Score 클래스를 vo 패키지로 이동
// - 클래스가 많을 경우 유지보수하기 쉽도록 적절한 패키지로 분산 배치한다.
// - 데이터 타입의 역할을 하는 클래스의 경우
// 보통 domain, vo(value object), dto(data transfer object) 라는 이름을 가진
// 패키지에 분류한다.
// - 패키지가 다르면 modifier 옵션에 따라 접근 범위가 달라진다.
// 멤버의 접근 범위 설정
// - public: 모두 공개
// - protected: 서브 클래스와 같은 패키지의 멤버에게만 공개
// - (default): 같은 패키지의 멤버에게만 공개
// - private: 접근 불가! 그 멤버가 속한 클래스의 내부에서만 접근 가능
// 8) 생성자 도입:
// - 인스턴스를 생성할 때 값을 초기화시키는 특별한 메서드


public class Test03 {
  public static void main(String[] args) {

    Score s1 = new Score("홍길동", 100, 90, 85);

    s1.compute();
    printScore(s1);


    Score s2 = new Score("임꺽정", 90, 80, 75);


    s2.compute();
    printScore(s2);



    Score s3 = new Score("유관순", 80, 70, 65);

    s3.compute();
    printScore(s3);

  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = (float) s.sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }


  static void compute(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = (float) s.sum / 3;
  }

}
