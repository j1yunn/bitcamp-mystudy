package project3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookClub {
    private List<Member> members;
    private final String membersFileName = "members.dat";
    private String bookOfTheWeek;
    private final String bookFileName = "bookOfTheWeek.dat";

    public BookClub() {
        members = new ArrayList<>();
        loadMembers();
        loadBookOfTheWeek();
    }

    public void addMember(Member member) {
        members.add(member);
        saveMembers();
    }

    public void removeMember(String email) {
        members.removeIf(member -> member.getEmail().equals(email));
        saveMembers();
    }

    public List<Member> getMembers() {
        return members;
    }

    public String getBookOfTheWeek() {
        return bookOfTheWeek;
    }

    public void setBookOfTheWeek(String bookOfTheWeek) {
        this.bookOfTheWeek = bookOfTheWeek;
        saveBookOfTheWeek();
    }

    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(membersFileName))) {
            members = (List<Member>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("멤버 파일을 찾을 수 없습니다.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveMembers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(membersFileName))) {
            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadBookOfTheWeek() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bookFileName))) {
            bookOfTheWeek = (String) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("책 파일을 찾을 수 없습니다.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveBookOfTheWeek() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bookFileName))) {
            oos.writeObject(bookOfTheWeek);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
