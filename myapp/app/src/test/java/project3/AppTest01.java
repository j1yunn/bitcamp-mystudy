package project3;

import java.util.Scanner;

import java.util.Scanner;

public class AppTest01 {
    public static void main(String[] args) {
        BookClub bookClub = new BookClub();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("건지 감자껍질파이 북클럽");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 멤버 조회");
            System.out.println("3. 멤버 수정");
            System.out.println("4. 종료");
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
                    System.out.println("이름:");
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
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}

