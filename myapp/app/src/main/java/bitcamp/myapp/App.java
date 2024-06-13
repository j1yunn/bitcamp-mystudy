package bitcamp.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static Scanner keyboardScanner = new Scanner(System.in);

    static String[] menus = new String[] {
            "회원",
            "팀",
            "프로젝트",
            "게시판",
            "도움말",
            "종료"
    };


    static String[] menus = new String[] {"등록", "목록", "조회", "변경", "삭제"};
    static String[] memberMenus = new String[] {"등록", "목록", "조회", "변경", "삭제"};

    public static void main(String[] args) {

        printMenu(); // 메서드에 묶인 코드를 실행하는 것을 "메서드를 호출(call)한다"라고 부른다.

        String command;
        while (true) {
            try {
                command = prompt("메인");

                for (int i = 0; i < menus.length; i++) {
                    if (menus[i].equals("종료")) {
                        System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);

                if (command.equals("menu")) {
                    printMenu();

                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo); // 설명하는 변수
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                        break;
                    } else {
                        if (menuTitle.equals("회원")) {
                            System.out.println(("[회원]"));
                            System.out.println(("1. 등록"));
                            System.out.println(("2. 목록"));
                            System.out.println(("3. 조회"));
                            System.out.println(("4. 변경"));
                            System.out.println(("5. 삭제"));
                            System.out.println(("9. 이전"));
                            while (true) {
                                command = prompt("메인/회원");
                                if (command.equals("9")) {
                                    break;
                                } else {
                                    System.out.println(command);
                                }
                            }
                        }

                    } else {
                        switch (menuTitle) {
                            case "회원": processMenu(menuTitle, memberMenus); break;
                            case "팀"
                                break;
                            case "회원"
                                break;
                            case "팀"
                                break;
                            case "프로젝트"
                                break;
                            case "게시판"
                                break;


                 static String[] menus = new String[] {"회원", "팀", "프로젝트", "게시판", "도움말", "종료"}

                        }
                    }
                        System.out.println(menuTitle);
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");

                if
            }
        }

        System.out.println("종료합니다.");

        keyboardScanner.close();
    }

    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }

        System.out.println(boldAnsi + line + resetAnsi);
        for (int i = 0; i < menus.length; i++) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
    }

    static String prompt(String title) {
        System.out.printf("\%s", "> ");
        return keyboardScanner.nextLine();
    }

        static void processMenu(String.)

    static boolean isValidateMenu(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }

    static String getMenuTitle(int menuNo) {
//        if (isValidateMenu(menuNo)) {
//            return menus[menuNo - 1];
//        }
//        return null;

        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;
    }

}
