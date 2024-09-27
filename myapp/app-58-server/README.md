# 58. 페이지 컨트롤러를 POJO로 전환하기

## 학습목표

- POJO의 개념을 설명할 수 있다.
- Reflection API와 Annotation 기술을 사용하여 클래스의 메서드를 찾아 호출할 수 있다.

## 요구사항

- 페이지 컨트롤러를 POJO 로 전환하라.
- 요청이 들어 왔을 때 해당 메서드를 자동으로 호출하라.

## 실행 결과

- 이전과 같다.

## 작업

- 프론트 컨트롤러 변경
  - DispatcherServlet 클래스 변경
- 요청 핸들러를 표기하기 위한 애노테이션 생성
  - RequestHandler 애노테이션 정의
- 페이지 컨트롤러 역할을 하는 서블릿 변경
  - POJO 클래스로 전환


## 소스 파일
