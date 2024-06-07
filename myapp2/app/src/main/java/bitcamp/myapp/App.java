package bitcamp.myapp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 메뉴 배열 정의
        String[] menus = {"회원", "팀", "프로젝트", "게시판", "도움말", "종료"};

        // 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 실행

        // 메뉴 출력
        System.out.println("----------------------------------------------");
        System.out.println("[팀 프로젝트 관리 시스템]\n");
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i]);
        }
        System.out.println("----------------------------------------------");

        System.out.println("메뉴를 입력하세요.");

        while (true) {

            // 메뉴 번호 입력 받기
            System.out.print("> ");
            int menuNumber = scanner.nextInt();

            // 종료 확인
            if (menuNumber == menus.length) {
                System.out.println("종료합니다.");
                break;
            }

            // 메뉴 번호가 옳지 않을 경우 처리
            if (menuNumber < 1 || menuNumber > menus.length) {
                System.out.println("메뉴 번호가 옳지 않습니다.");
            } else {
                // 메뉴 이름 출력
                System.out.println(menus[menuNumber - 1]);
            }
        }

        // 스캐너 닫기
        scanner.close();
    }
}