# bitcamp-study

네이버클라우드캠프 데브옵스 14기 실습 자료 저장소

## 웨일온 접속 정보

- 회의실 번호 / 암호: 210 866 3081 / 111222
- 회의링크: https://whaleon.us/o/CSrtk1/84888a51da9d4f939e63eee37248fb28

## 강의자료

- 실습(https://github.com/eomjinyoung/bitcamp-study)
- 강의자료
  - 수업 문서(https://github.com/eomcs/eomcs-docs)
  - 프로그래밍 자료(https://github.com/eomcs/eomcs-java)

## 1일차(2024-05-24,금)

- 소프트웨어 개요
  - 시스템 소프트웨어와 애플리케이션 소프트웨어
  - Standalone과 Client/Server
  - 설치형과 비설치형
  - 애플리케이션의 기본 구조
- GIT 설치
  - 실습 저장소 준비 및 복제

## 2일차(2024-05-27,월)

- GIT 소개
  - 기본 명령 사용법(clone, add, commit, push, pull)
  - 개인 저장소 준비 및 가져오기
    - `$ git clone https://github.com/사용자이름/bitcamp-mystudy`
  - 실습 저장소 가져오기
    - `$ git clone https://github.com/eomjinyoung/bitcamp-study`
  - 수업문서 가져오기
    - `$ git clone https://github.com/eomcs/eomcs-docs`
  - 프로그래밍 자료 가져오기
    - `$ git clone https://github.com/eomcs/eomcs-java`
- 개발 도구 준비
  - 기본 편집기: VSCode
  - Windows gcc 컴파일러 설치
  - VirtualBox 설치
  - Vagrant 설치
- 웹 애플리케이션 구동 원리 소개
  - 웹 애플리케이션의 구성 요소: HTML, CSS, JavaScript, Images, Application
  - 웹 애플리케이션 구현 기술: Java, SQL, HTML, CSS, JavaScript 등
- 애플리케이션 개발 및 실행 과정 실습
  - hello.c 작성 및 컴파일, 실행
- CPU, 기계어, OS의 관계 이해
- 수업 진행 방식 소개

## 3일차(2024-05-28,화)

- 컴파일 방식과 인터프리터 방식, 하이브리드 방식
  - Nodejs 설치 및 실행
    - hello.js
  - JDK 설치 및 실행
    - Hello.java
- Java 컴파일 및 실행 원리
  - 자바컴파일러와 바이트코드
  - JVM
- 자바 제품 소개
  - Java SE(JRE, Server JRE, JDK)
  - Java EE(Servlet/JSP/EL/JSTL, EJB/WebService/REST API 등)
  - Java ME

## 4일차(2024-05-29,수)

- 개발 도구 설정
  - 폰트 설치
    - D2Coding 폰트
  - VSCode 설정
    - Font Size: 18
    - Font Family: D2Coding
    - Java Formatting: GoogleStyle
    - Format On Save: 활성화
    - Code Lens: 비활성화
    - Inlay Hints: 비활성화
- Java 컴파일과 실행
  - 컴파일 옵션 사용법
  - JVM 옵션 사용법
- 자바 프로젝트 디렉토리 구조
  - Maven 표준 자바 프로젝트 디렉토리 구성하기
  - java-lang 프로젝트 구성
  - myapp 프로젝트 구성
- 빌드 도구
  - 빌드의 개념
  - 빌드 도구 소개: Ant, Maven, Gradle
  - Gradle 빌드 도구 설치 및 사용법
    - 자바 프로젝트 디렉토리를 구성하기
    - 자동 생성된 디렉토리 및 파일의 역할 이해
    
## 5일차(2024-05-30,목)
  
- 직접 Bytecode 로 프로그래밍 하기
  - HelloWorld.class 파일 제작 및 실행
- 자바 기초 프로그래밍
  - 소스 파일(.java)과 클래스 블록, 클래스 파일(.class)
  - public 클래스와 소스 파일명
  - 애플리케이션 entry point: main() 메서드
  - 애플리케이션 아규먼트 다루는 방법: main(String[] args)

## 6일차(2024-05-31,금)
  
- 자바 기초 프로그래밍
  - 패키지 
  - 데이터 타입과 리터럴
  - 문자와 문자집합

## 7일차(2024-06-03,월)
  
- 자바 기초 프로그래밍
  - 문자와 문자집합(계속)
  - 문자를 저장하는 원리
  - 정수를 메모리에 저장하는 원리
  - 부동소수점을 메모리에 저장하는 원리

## 8일차(2024-06-04,화)

- 자바 기초 프로그래밍
  - 변수 선언 의미와 방법
  - 데이터 타입에 따라서 변수에 저장할 수 있는 값의 유효 범위
- 개발 도구
  - Eclipse IDE 설치 및 설정
  - Gradle 빌드 도구로 만든 프로젝트를 Eclipse IDE로 임포트 하는 방법

## 9일차(2024-06-05,수)

- 실습 프로젝트
  - myapp 프로젝트 생성 및 빌드, 실행
  - 01. 자바 프로젝트 준비하기
  - 02. 리터럴과 변수를 사용해서 문자열 출력하기
  - 03. ANSI 이스케이프 코드를 사용하여 출력 문자열 꾸미기
  - 04. 키보드 입력 다루기
- 개발 도구
  - IntelliJ IDE 설치 및 설정

## 10일차(2024-06-07,금)

- 자바 기초 프로그래밍
  - 연산자

## 11일차(2024-06-10,월)

- 자바 기초 프로그래밍
  - 조건문, 반복문, 배열
  - 레퍼런스와 인스턴스
  - 가비지와 가비지 컬렉터
- 실습 프로젝트
  - 05. 배열을 활용하여 메뉴 목록 다루기
  - 06. 예외 처리하기

## 12일차(2024-06-11,화)

- 자바 기초 프로그래밍
  - print(), println(), printf() 사용법
  - Scanner 클래스 사용법
- 실습 프로젝트
  - 07. 문자열 비교와 데이터 변환 다루기
  - 08. 기능 단위로 명령문 묶기 : 메서드 사용법

## 13일차(2024-06-12,수)

- 자바 기초 프로그래밍
  - 메서드 사용법
    - 메서드 정의와 호출
    - 스레드 개념과 'main' 스레드
    - single thread와 multiple thread
    - 파라미터와 아규먼트
    - 메서드 로컬 변수와 JVM Stack, Frame 메모리
    - 재귀호출
    - call by value 와 call by reference
- 실습 프로젝트
  - 07 버전을 08 버전으로 바꾸는 것 연습

## 14일차(2024-06-13,목)

- 자바 기초 프로그래밍
  - 메서드 사용법
- 실습 프로젝트
 - 09. 자바 기본 문법 활용 연습

## 15일차(2024-06-14,금)

- 자바 프로그래밍
  - 클래스 사용법
    - 사용자 데이터 타입 정의
    - 메서드 분류
- 실습 프로젝트
 - 10. CRUD 구현하기
  - 회원 CRUD 구현

## 16일차(2024-06-17,월)

- 자바 프로그래밍
  - 클래스 사용법(계속)
    - 사용자 데이터 타입 정의
    - 메서드 분류
    - static 필드와 non-static 필드
    - static 메서드와 non-static 메서드
    - 인스턴스와 레퍼런스
    - private, public modifier
    - getter/setter 메서드
    - 생성자
- 실습 프로젝트

## 17일차(2024-06-18,화)

- 자바 프로그래밍
  - 클래스 사용법(계속)
    - 복습
- 실습 프로젝트
  - 10. CRUD 구현하기(계속)
    - 프로젝트 CRUD 구현

## 18일차(2024-06-19,수)

- 자바 프로그래밍
  - 클래스 사용법(계속)
- 실습 프로젝트
  - 10. CRUD 구현하기(계속)
    - 게시글 CRUD 구현

## 19일차(2024-06-20,목)

- 자바 프로그래밍
  - 상속
    - 상속 관계와 레퍼런스
- 실습 프로젝트
  - 11. 데이터 식별 번호 부여하기
  - 12. 인스턴스 목록을 다루는 코드를 분리하기 : GRASP의 High Cohesion 설계 패턴
  
## 20일차(2024-06-21,금)

- 자바 프로그래밍
  - 상속(계속)
- 실습 프로젝트
  - 13. 스태틱 필드의 한계를 극복하기: 인스턴스 필드 사용
  - 14. 공통 코드 분리와 사용하기: 상속의 일반화 기법

## 21일차(2024-06-24,월)

- 자바 프로그래밍
  - 기본 클래스 사용법: Object 클래스
- 실습 프로젝트
  - 

## 22일차(2024-06-25,화)

- 자바 프로그래밍
  - 기본 클래스 사용법: String, Wrapper 클래스
- 실습 프로젝트
 - 15. 배열 크기 자동 증가시키기: 배열 복제와 문제점
 - 16. LinkedList 자료구조 구현하기: 배열의 단점 극복

## 23일차(2024-06-26,수)

- 자바 프로그래밍
  - 인터페이스 사용법
- 실습 프로젝트
 - 17. 인터페이스를 이용한 객체 사용 규칙 정의: 목록을 다루는 규칙
 - 18. 추상 클래스를 이용하여 공통 코드를 서브 클래스에게 상속
 - 19. 특정 클래스에서만 사용되는 클래스는 중첩 클래스로 정의하기

## 24일차(2024-06-27,목)

- 자바 프로그래밍
  - 클래스 문법: 스태틱 멤버, 인스턴스 멤버, 초기화 블록, 생성자, this()
- Git 사용법
  - 팀 프로젝트를 위한 리포지토리 생성 및 공유하는 방법
  - 팀 프로젝트에서 Git을 사용하는 방법
  - 코드 충돌 해결하는 방법
- 실습 프로젝트
- 미니 과제 프로젝트
  - 주제: 가계부
  - 팀 구성
    - 김민수, 양지윤
    - 권준성, 권기윤
    - 이재욱, 김주연
    - 이민석, 이우성
    - 김재정, 김재우
    - 강슬기, 이가람, 강윤상
    - 정찬우, 최동인
    - 임상우, 백현기
    - 신승민, 이태정
    - 장혜정, 이선아
    - 이건학, 황민지

## 25일차(2024-06-28,금)

- 자바 프로그래밍
  - 상속
- 실습 프로젝트
- 미니 과제 프로젝트
  - 구현


## 26일차(2024-07-01,월)

- 자바 프로그래밍
  - 다형성: 다형적 변수, 오버로딩, 오버라이딩, this/super 키워드 사용법
- 실습 프로젝트
- 미니 과제 프로젝트
  - 팀 별 구현 기능 시연
- 미니 과제 프로젝트 2
  - 주제: 해야 할 일(ToDo List)
  - 팀 구성
    - 이건학, 이재욱
    - 이우성, 신승민
    - 정찬우, 장혜정
    - 김주연, 백현기
    - 권기윤, 이가람
    - 최동인, 김재우
    - 강슬기, 김재정
    - 임상우, 이태정, 김민수
    - 황민지, 권준성
    - 강윤상, 이선아
    - 이민석, 양지윤 

## 27일차(2024-07-02,화,오전)

- 특강

## 27일차(2024-07-02,화, 오후)

- 자바 프로그래밍
  - 추상클래스 사용법
  - GoF의 Template Method 설계 패턴 
- 실습 프로젝트
- 미니 과제 프로젝트 2
  - 구현

## 28일차(2024-07-03,수)

- 자바 프로그래밍
  - 추상클래스 사용법(계속)
  - 캡슐화
    - 멤법 접근 제어 modifier(private, (default), protected, public)
    - 추상화 개념
  - GoF의 디자인 패턴
    - Abstract Factory, Singleton 설계 패턴 이해 및 구현
    - Factory Method, Template Method 설계 패턴 연습
- 실습 프로젝트
- 미니 과제 프로젝트 2
  - 구현

## 29일차(2024-07-04,목)

- 자바 프로그래밍
  - 인터페이스 사용법
  - 인터페이스와 추상클래스 콜라보
  - 인터페이스 활용 예
- 실습 프로젝트
- 미니 과제 프로젝트 2
  - 구현

## 30일차(2024-07-05,금)

- 자바 프로그래밍
  - 인터페이스 활용 예(계속)
  - GoF의 디자인 패턴
    - Adapter 패턴, Iterator 패턴 
- 실습 프로젝트
- 미니 과제 프로젝트 2
  - 팀 별 구현 기능 시연

## 31일차(2024-07-08,월)

- 이론
  - 자바 프로그래밍
  - UML 
    - 클래스 다이어그램: 클래스 관계 
- 실습 프로젝트
  - 17. 인터페이스를 이용한 객체 사용 규칙 정의(변경)
  - 18. 리팩토링: GRASP의 High Cohesion 적용(개정)
  - 19. 리팩토링: 상속의 Generalization 적용(개정)

## 32일차(2024-07-09,화)

- 이론
  - 자바 프로그래밍
- 실습 프로젝트
  - 20. 리팩토링: Map 컬렉션과 의존성 주입
  - 21. 스택과 큐 다루기

## 33일차(2024-07-10,수)

- 이론
  - 자바 프로그래밍
    - enhanced for 문과 Iterable 인터페이스
- 실습 프로젝트
  - 22. Iterator 디자인 패턴을 활용하여 목록 조회 기능을 캡슐화하기
  - 23. 특정 클래스에서만 사용되는 의존 객체는 중첩 클래스로 정의하기
  - 24. 자바 Collection API 사용하기

## 34일차(2024-07-11,목)

- 이론
  - 자바 프로그래밍
    - 중첩 클래스 사용법
- 실습 프로젝트
  - 24. 제네릭을 사용하여 타입을 파라미터로 다루기
  - 25. 자바 Collection API 사용하기(재작성)
- 미니 과제 프로젝트 3
  - 주제: 도서 대출 시스템
  - 팀 구성
    - 이우성, 임상우
    - 김주연, 황민지
    - 장혜정, 김재우
    - 이재욱, 이선아
    - 정찬우, 이건학
    - 신승민, 양지윤
    - 이민석, 강슬기
    - 이태정, 권기윤
    - 김민수, 최동인, 김재정
    - 백현기, 강윤상
    - 이가람, 권준성

## 35일차(2024-07-12,금)

- 이론
  - 자바 프로그래밍
    - 중첩 클래스 사용법(계속)
- 실습 프로젝트
- 미니 과제 프로젝트 3
  - 주제: 도서 대출 시스템
    - 구현

## 36일차(2024-07-15,월)

- 이론
  - 자바 프로그래밍
- 실습 프로젝트
  - 26. 메뉴 UI를 캡슐화하기: GoF의 Composite 패턴 적용
  - 27. 각각의 메뉴 처리 기능을 객체화 하기: GoF의 Command 패턴 적용하기
- 미니 과제 프로젝트 3
  - 주제: 도서 대출 시스템
    - 구현

## 37일차(2024-07-16,화)

- 이론
  - 자바 프로그래밍
    - 람다(lambda) 사용법
- 실습 프로젝트
- 미니 과제 프로젝트 3
  - 주제: 도서 대출 시스템
    - 구현

## 38일차(2024-07-17,수)

- 이론
  - 자바 프로그래밍
    - 람다(lambda) 사용법(계속)
- 실습 프로젝트
- 미니 과제 프로젝트 3
  - 팀 별 구현 기능 시연

## 39일차(2024-07-18,목)

- 이론
  - 자바 프로그래밍
- 실습 프로젝트
  - 27. 각각의 메뉴 처리 기능을 객체화 하기: GoF의 Command 패턴 적용하기(개정)
    - MenuGroup 변경: 메뉴 경로 생성 방식 변경
  - 28. File I/O API 활용하기 I : 데이터를 바이너리 형식으로 입출력  

## 40일차(2024-07-19,금)

- 이론
  - 자바 프로그래밍
    - GoF의 Decorator 설계 패턴
- 실습 프로젝트
  - 29. File I/O API 활용하기 II : 데코레이터를 이용한 데이터 변환 자동화 
  - 30. File I/O API 활용하기 III : 객체 직렬화/역직렬화
  - 31. File I/O API 활용하기 IV : 데이터를 CSV 형식의 텍스트로 입출력

## 41일차(2024-07-22,월)

- 이론
  - 자바 프로그래밍
    - 제네릭 사용법
- 실습 프로젝트
  - 32. File I/O API 활용하기 V : JSON 형식의 텍스트로 입출력

## 42일차(2024-07-23,화)

- 이론
  - 자바 프로그래밍
    - File I/O API 사용법
- 실습 프로젝트

## 43일차(2024-07-24,수)

- 이론
  - 자바 프로그래밍
    - File I/O API 사용법(계속)
    - Apache POI 라이브러리를 사용하여 엑셀 파일 읽고 쓰기
- 실습 프로젝트
  - 33. Apache POI 라이브러리 활용하기 : 데이터를 엑셀 포맷의 파일로 입출력

## 44일차(2024-07-25,목)

- 이론
  - 자바 프로그래밍
- 실습 프로젝트
  - 34. DAO 객체 필요성 이해하기 : 데이터 컬렉션을 List에서 Map으로 교체
  - 35. 데이터 접근 로직을 캡슐화하기 : DAO 객체 도입

## 45일차(2024-07-26,금)

- 이론
  - 자바 프로그래밍
    -
- 실습 프로젝트
  - 35. 데이터 접근 로직을 캡슐화하기 : DAO 객체 도입(계속)
  - 36. 애플리케이션 시작/종료 상태일 때 알림 받기 : GoF의 Observer 패턴 적용

## 46일차(2024-07-28,월)

- 이론
  - 자바 프로그래밍
    - GoF의 Proxy 설계 패턴 사용법
- 실습 프로젝트
  - 37. 애플리케이션 간에 데이터 공유하기 : Client/Server 아키텍처로 전환