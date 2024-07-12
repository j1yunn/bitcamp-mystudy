package project4;

import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 도서 신청");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 평가");
            System.out.println("4. 관심 도서");
            System.out.println("5. 이전");
            System.out.println("6. 종료");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookManager.addBook();
                    break;
                case 2:
                    bookManager.viewBooks();
                    break;
                case 3:
                    bookManager.reviewBook();
                    break;
                case 4:
                    bookManager.wishlistBook();
                    break;
                case 5:
                    // 이전 메뉴, 현재는 기능 없음
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
