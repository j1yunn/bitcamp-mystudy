package project3;

import java.util.Scanner;

public class AppTest01 {
    public static void main(String[] args) {
        BookClub bookClub = new BookClub();
        Scanner scanner = new Scanner(System.in);

        System.out.println("금주의 책: " + bookClub.getBookOfTheWeek());

        while (true) {
            System.out.println("\n건지 감자껍질파이 북클럽");
            System.out.println("[ 1. 등록 ]     [ 2. 조회 ]     [ 3. 수정 ]     [ 4. 책 등록하기 ]     [ 5. 종료 ]");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("이메일: ");
                    String email = scanner.nextLine();
                    bookClub.addMember(new Member(name, email));
                    System.out.println("멤버가 등록되었습니다. 환영합니다!");
                    break;
                case 2:
                    System.out.println("멤버 목록:");
                    for (Member member : bookClub.getMembers()) {
                        System.out.println(member);
                    }
                    break;
                case 3:
                    System.out.print("삭제할 멤버의 이메일을 입력하세요: ");
                    String emailToDelete = scanner.nextLine();
                    bookClub.removeMember(emailToDelete);
                    System.out.println("멤버가 삭제되었습니다. 다음에 또 만나요.");
                    break;
                case 4:
                    System.out.print("금주의 책 제목을 입력하세요: ");
                    String bookOfTheWeek = scanner.nextLine();
                    bookClub.setBookOfTheWeek(bookOfTheWeek);
                    System.out.println("금주의 책이 등록되었습니다.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
