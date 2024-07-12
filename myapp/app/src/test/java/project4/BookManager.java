package project4;

// BookManager.java
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> books;
    private Scanner scanner;

    public BookManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("책제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("출판연도: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("가격: ");
        int price = Integer.parseInt(scanner.nextLine());

        books.add(new Book(title, author, year, price));
        System.out.println("도서가 성공적으로 추가되었습니다.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%d. %s\n", i + 1, book);
        }
    }

    public void reviewBook() {
        viewBooks();

        if (books.isEmpty()) {
            return;
        }

        System.out.print("평가할 도서를 선택하세요: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= books.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        System.out.print("한줄평가를 입력하세요: ");
        String review = scanner.nextLine();
        books.get(index).reviews.add(review);
        System.out.println("평가가 성공적으로 등록되었습니다.");
    }

    public void wishlistBook() {
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%d. %s / %s\n", i + 1, book.title, book.author);
        }

        System.out.print("위시리스트에 추가할 도서를 선택하세요: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= books.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        System.out.print("위시리스트를 등록하시겠습니까? (y/n): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            books.get(index).wishlistCount++;
            System.out.println("위시리스트에 성공적으로 등록되었습니다.");
        } else {
            System.out.println("위시리스트 등록이 취소되었습니다.");
        }
    }
}
