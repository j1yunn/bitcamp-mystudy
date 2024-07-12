package project4;

// Book.java
import java.util.ArrayList;

public class Book {
    String title;
    String author;
    int year;
    int price;  // 가격을 정수로 변경
    int wishlistCount;
    ArrayList<String> reviews;

    public Book(String title, String author, int year, int price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.wishlistCount = 0;
        this.reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s / %s / %d년 / %d원 / ⭐%d / 한줄평가: %s",
                title, author, year, price, wishlistCount, reviews);
    }
}
