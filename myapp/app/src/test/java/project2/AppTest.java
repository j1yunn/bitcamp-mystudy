package project2;

import java.util.Scanner;

public class AppTest {

    private static final String[] mainMenus = {"추가", "조회", "수정", "삭제", "종료"};
    private static final String[][] subMenus = {
            {"오늘 할 일 추가", "올해 목표 추가", "동기부여 추가", "오늘의 기분 추가", "이전"},
            {"일 단위 조회", "월 단위 조회", "기분 일기 조회", "이전"},
            {"오늘의 할 일 수정", "올해 목표 수정", "동기부여 수정", "오늘의 기분 수정", "이전"},
            {"오늘의 할 일 삭제", "올해 목표 삭제", "동기부여 삭제", "오늘의 기분 삭제", "이전"}
    };

    private static Scanner scanner = new Scanner(System.in);
    private static TodoList todoList = new TodoList();
    private static Motivation motivation = new Motivation();
    private static Mood mood = new Mood();

    public static void main(String[] args) {
        todoList.loadData();
        motivation.loadData();
        mood.loadData();

        while (true) {
            showMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    processSubMenu(subMenus[0]);
                    break;
                case 2:
                    processSubMenu(subMenus[1]);
                    break;
                case 3:
                    processSubMenu(subMenus[2]);
                    break;
                case 4:
                    processSubMenu(subMenus[3]);
                    break;
                case 5:
                    exitProgram();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("[  To-do List  ]");
        System.out.println("성공은 매일 반복한 작은 노력들의 합이다. - 로버트 콜리어");
        for (int i = 0; i < mainMenus.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), mainMenus[i]);
        }
        System.out.print("메뉴 선택: ");
    }

    private static int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        return choice;
    }

    private static void processSubMenu(String[] menus) {
        while (true) {
            showSubMenu(menus);
            int choice = getUserChoice();

            if (choice == menus.length) {
                break;  // 이전 메뉴 선택
            } else if (choice >= 1 && choice <= menus.length - 1) {
                executeCommand(menus[choice - 1]);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void showSubMenu(String[] menus) {
        for (int i = 0; i < menus.length - 1; i++) {
            System.out.printf("%d. %s\n", (i + 1), menus[i]);
        }
        System.out.printf("%d. %s\n", menus.length, "이전");
        System.out.print("선택: ");
    }

    private static void executeCommand(String command) {
        switch (command) {
            case "오늘 할 일 추가":
                todoList.addTodo(scanner);
                break;
            case "올해 목표 추가":
                todoList.addGoal(scanner);
                break;
            case "동기부여 추가":
                motivation.addMotivation(scanner);
                break;
            case "오늘의 기분 추가":
                mood.addMood(scanner);
                break;
            case "일 단위 조회":
                todoList.viewDaily(scanner);
                break;
            case "월 단위 조회":
                todoList.viewMonthly(scanner);
                break;
            case "기분 일기 조회":
                mood.viewMoodDiary();
                break;
            case "오늘의 할 일 수정":
                todoList.editTodo(scanner);
                break;
            case "올해 목표 수정":
                todoList.editGoal(scanner);
                break;
            case "동기부여 수정":
                motivation.deleteMotivation(scanner);
                motivation.addMotivation(scanner);
                break;
            case "오늘의 기분 수정":
                mood.editMood(scanner);
                break;
            case "오늘의 할 일 삭제":
                todoList.deleteTodo(scanner);
                break;
            case "올해 목표 삭제":
                todoList.deleteGoal(scanner);
                break;
            case "동기부여 삭제":
                motivation.deleteMotivation(scanner);
                break;
            case "오늘의 기분 삭제":
                mood.deleteMood(scanner);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    private static void exitProgram() {
        todoList.saveData();
        motivation.saveData();
        mood.saveData();
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
        System.exit(0);
    }
}
